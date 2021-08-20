import Vue from 'vue'   //引入vue
import Vuex from 'vuex'  //引入vuex

Vue.use(Vuex) //使用vuex

const store = new Vuex.Store({
  state: {           //用state声名你要储存的对象，初始值设为undefined
    user: undefined,
    password: undefined
  },
  getters:{          //store 的计算属性 关于功能可以访问https://vuex.vuejs.org/zh/guide/getters.html

  },
  mutations: {       //vuex中的事件函数 关于功能可以访问https://vuex.vuejs.org/zh/guide/mutations.html
    login (state, payload) {    //state 是上面定义过的 payload 是传进来的对象
      state.user = payload.username,
      state.password = payload.userpassword
    },
    logout (state) {
      state.user = undefined,
      state.password = undefined
    }
  },
  actions: {                          //Action 类似于 mutation，不同在于：      可以访问https://vuex.vuejs.org/zh/guide/actions.html  
    login (context, payload) {        //Action 提交的是 mutation，而不是直接变更状态。
      context.commit('login', payload)//Action 可以包含任意异步操作。
    },
    logout (context) {
      context.commit('logout')        //还有一个Modules可以访问https://vuex.vuejs.org/zh/guide/modules.html
    }
  }
})

export default store