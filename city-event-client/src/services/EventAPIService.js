import axios from 'axios';

const EVENT_API_BASE_URL = 'http://localhost:8083/events';

class EventAPIService {

    fetchEvents() {
        return axios.get(EVENT_API_BASE_URL);
    }

    fetchEventsById(eventId) {
        return axios.get(EVENT_API_BASE_URL + '/' + eventId);
    }

    deleteEvent(eventId) {
        return axios.delete(EVENT_API_BASE_URL + '/' + eventId);
    }

    addEvent(event) {
        return axios.post(""+EVENT_API_BASE_URL, event);
    }

    editEvent(event) {
        return axios.put(EVENT_API_BASE_URL + '/' + event.id, event);
    }

}

export default new EventAPIService();
