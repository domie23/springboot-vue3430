import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'

     import users from '@/views/modules/users/list'
    import churushenhe from '@/views/modules/churushenhe/list'
    import dictionary from '@/views/modules/dictionary/list'
    import fangjain from '@/views/modules/fangjain/list'
    import gongzuorenyuan from '@/views/modules/gongzuorenyuan/list'
    import news from '@/views/modules/news/list'
    import quyujiancha from '@/views/modules/quyujiancha/list'
    import shequ from '@/views/modules/shequ/list'
    import shequfenpei from '@/views/modules/shequfenpei/list'
    import shequjubao from '@/views/modules/shequjubao/list'
    import yiqingquyu from '@/views/modules/yiqingquyu/list'
    import yonghu from '@/views/modules/yonghu/list'
    import zhuzhai from '@/views/modules/zhuzhai/list'
    import dictionaryChurushenhe from '@/views/modules/dictionaryChurushenhe/list'
    import dictionaryChurushenheYesno from '@/views/modules/dictionaryChurushenheYesno/list'
    import dictionaryFangjain from '@/views/modules/dictionaryFangjain/list'
    import dictionaryNews from '@/views/modules/dictionaryNews/list'
    import dictionaryQuyujiancha from '@/views/modules/dictionaryQuyujiancha/list'
    import dictionarySex from '@/views/modules/dictionarySex/list'
    import dictionaryShequ from '@/views/modules/dictionaryShequ/list'
    import dictionaryShequjubao from '@/views/modules/dictionaryShequjubao/list'
    import dictionaryYiqingquyu from '@/views/modules/dictionaryYiqingquyu/list'
    import dictionaryZhuzhai from '@/views/modules/dictionaryZhuzhai/list'





//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    } ,{
        path: '/users',
        name: '管理信息',
        component: users
      }
    ,{
        path: '/dictionaryChurushenhe',
        name: '出入类型',
        component: dictionaryChurushenhe
    }
    ,{
        path: '/dictionaryChurushenheYesno',
        name: '申请状态',
        component: dictionaryChurushenheYesno
    }
    ,{
        path: '/dictionaryFangjain',
        name: '房间类型',
        component: dictionaryFangjain
    }
    ,{
        path: '/dictionaryNews',
        name: '公告类型',
        component: dictionaryNews
    }
    ,{
        path: '/dictionaryQuyujiancha',
        name: '检查类型',
        component: dictionaryQuyujiancha
    }
    ,{
        path: '/dictionarySex',
        name: '性别类型',
        component: dictionarySex
    }
    ,{
        path: '/dictionaryShequ',
        name: '社区类型',
        component: dictionaryShequ
    }
    ,{
        path: '/dictionaryShequjubao',
        name: '举报类型',
        component: dictionaryShequjubao
    }
    ,{
        path: '/dictionaryYiqingquyu',
        name: '疫情区域类型',
        component: dictionaryYiqingquyu
    }
    ,{
        path: '/dictionaryZhuzhai',
        name: '住宅类型',
        component: dictionaryZhuzhai
    }


    ,{
        path: '/churushenhe',
        name: '出入申请',
        component: churushenhe
      }
    ,{
        path: '/dictionary',
        name: '字典表',
        component: dictionary
      }
    ,{
        path: '/fangjain',
        name: '房间信息',
        component: fangjain
      }
    ,{
        path: '/gongzuorenyuan',
        name: '工作人员',
        component: gongzuorenyuan
      }
    ,{
        path: '/news',
        name: '公告信息',
        component: news
      }
    ,{
        path: '/quyujiancha',
        name: '区域疫情检查',
        component: quyujiancha
      }
    ,{
        path: '/shequ',
        name: '社区信息',
        component: shequ
      }
    ,{
        path: '/shequfenpei',
        name: '社区分配',
        component: shequfenpei
      }
    ,{
        path: '/shequjubao',
        name: '社区举报',
        component: shequjubao
      }
    ,{
        path: '/yiqingquyu',
        name: '疫情区域信息',
        component: yiqingquyu
      }
    ,{
        path: '/yonghu',
        name: '居民',
        component: yonghu
      }
    ,{
        path: '/zhuzhai',
        name: '住宅信息',
        component: zhuzhai
      }


    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
