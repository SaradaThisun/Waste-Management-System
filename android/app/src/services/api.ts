import axios from 'axios';
import AsyncStorage from '@react-native-async-storage/async-storage';

const api = axios.create({
  baseURL: 'http://10.0.2.2:5300/api',
  headers: {
    'Content-Type': 'application/json',
  },
});

api.interceptors.request.use(
  async config => {
    const token = await AsyncStorage.getItem('token');

    if (token) {
      config.headers.Authorization = `Bearer ${token}`;
    }

    return config;
  },
  error => Promise.reject(error),
);


api.interceptors.request.use(
  async config => {
    const token = await AsyncStorage.getItem('token');

    console.log('TOKEN:', token);

    if (token) {
      config.headers.Authorization = `Bearer ${token}`;
    }

    return config;
  },
  error => Promise.reject(error),
);
export default api;