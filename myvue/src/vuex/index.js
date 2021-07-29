import Vue from 'vue'
import Vuex from 'vuex'

Vue.use(Vuex)

const store = new Vuex.Store({
  state: {
    user: undefined,
    password: undefined
  },
  mutations: {
    login (state, payload) {
      state.user = payload.username,
      state.password = payload.userpassword
    },
    logout (state) {
      state.user = undefined,
      state.password = undefined
    }
  },
  actions: {
    login (context, payload) {
      context.commit('login', payload)
    },
    logout (context) {
      context.commit('logout')
    }
  }
})

export default store