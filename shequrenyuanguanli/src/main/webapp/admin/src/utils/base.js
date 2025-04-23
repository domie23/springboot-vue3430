const base = {
    get() {
        return {
            url : "http://localhost:8080/shequrenyuanguanli/",
            name: "shequrenyuanguanli",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/shequrenyuanguanli/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "社区人员管理系统"
        } 
    }
}
export default base
