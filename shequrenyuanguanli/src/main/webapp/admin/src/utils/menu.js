const menu = {
    list() {
        return [
    {
        "backMenu":[
            {
                "child":[
                    {
                        "buttons":[
                            "查看",
                            "新增",
                            "修改",
                            "删除"
                        ],
                        "menu":"管理员管理",
                        "menuJump":"列表",
                        "tableName":"users"
                    }
                ],
                "menu":"管理员管理"
            }
            ,{
                "child":[
                    {
                        "buttons":[
                            "查看",
                            "新增",
                            "修改",
                            "删除"
                        ],
                        "menu":"出入申请管理",
                        "menuJump":"列表",
                        "tableName":"churushenhe"
                    }
                ],
                "menu":"出入申请管理"
            }
            ,{
                "child":[
                    {
                        "buttons":[
                            "查看",
                            "新增",
                            "删除",
                            "修改"
                        ],
                        "menu":"房间类型管理",
                        "menuJump":"列表",
                        "tableName":"dictionaryFangjain"
                    }
                    ,
                    {
                        "buttons":[
                            "查看",
                            "新增",
                            "删除",
                            "修改"
                        ],
                        "menu":"公告类型管理",
                        "menuJump":"列表",
                        "tableName":"dictionaryNews"
                    }
                    ,
                    {
                        "buttons":[
                            "查看",
                            "新增",
                            "删除",
                            "修改"
                        ],
                        "menu":"检查类型管理",
                        "menuJump":"列表",
                        "tableName":"dictionaryQuyujiancha"
                    }
                    ,
                    {
                        "buttons":[
                            "查看",
                            "新增",
                            "删除",
                            "修改"
                        ],
                        "menu":"社区类型管理",
                        "menuJump":"列表",
                        "tableName":"dictionaryShequ"
                    }
                    ,
                    {
                        "buttons":[
                            "查看",
                            "新增",
                            "删除",
                            "修改"
                        ],
                        "menu":"举报类型管理",
                        "menuJump":"列表",
                        "tableName":"dictionaryShequjubao"
                    }
                    ,
                    {
                        "buttons":[
                            "查看",
                            "新增",
                            "删除",
                            "修改"
                        ],
                        "menu":"疫情区域类型管理",
                        "menuJump":"列表",
                        "tableName":"dictionaryYiqingquyu"
                    }
                    ,
                    {
                        "buttons":[
                            "查看",
                            "新增",
                            "删除",
                            "修改"
                        ],
                        "menu":"住宅类型管理",
                        "menuJump":"列表",
                        "tableName":"dictionaryZhuzhai"
                    }
                ],
                "menu":"基础数据管理"
            }
            ,{
                "child":[
                    {
                        "buttons":[
                            "查看",
                            "新增",
                            "修改",
                            "删除"
                        ],
                        "menu":"房间信息管理",
                        "menuJump":"列表",
                        "tableName":"fangjain"
                    }
                ],
                "menu":"房间信息管理"
            }
            ,{
                "child":[
                    {
                        "buttons":[
                            "查看",
                            "新增",
                            "修改",
                            "删除"
                        ],
                        "menu":"工作人员管理",
                        "menuJump":"列表",
                        "tableName":"gongzuorenyuan"
                    }
                ],
                "menu":"工作人员管理"
            }
            ,{
                "child":[
                    {
                        "buttons":[
                            "查看",
                            "新增",
                            "修改",
                            "删除"
                        ],
                        "menu":"公告信息管理",
                        "menuJump":"列表",
                        "tableName":"news"
                    }
                ],
                "menu":"公告信息管理"
            }
            ,{
                "child":[
                    {
                        "buttons":[
                            "查看",
                            "新增",
                            "修改",
                            "删除"
                        ],
                        "menu":"区域疫情检查管理",
                        "menuJump":"列表",
                        "tableName":"quyujiancha"
                    }
                ],
                "menu":"区域疫情检查管理"
            }
            ,{
                "child":[
                    {
                        "buttons":[
                            "查看",
                            "新增",
                            "修改",
                            "删除"
                        ],
                        "menu":"社区信息管理",
                        "menuJump":"列表",
                        "tableName":"shequ"
                    }
                ],
                "menu":"社区信息管理"
            }
			,{
			    "child":[
			        {
			            "buttons":[
			                "查看",
                            "新增",
                            "修改",
                            "删除"
			            ],
			            "menu":"区域分配管理",
			            "menuJump":"列表",
			            "tableName":"shequfenpei"
			        }
			    ],
			    "menu":"区域分配管理"
			}
            ,{
                "child":[
                    {
                        "buttons":[
                            "查看",
                            "新增",
                            "修改",
                            "删除"
                        ],
                        "menu":"社区举报管理",
                        "menuJump":"列表",
                        "tableName":"shequjubao"
                    }
                ],
                "menu":"社区举报管理"
            }
            ,{
                "child":[
                    {
                        "buttons":[
                            "查看",
                            "新增",
                            "修改",
                            "删除"
                        ],
                        "menu":"疫情区域信息管理",
                        "menuJump":"列表",
                        "tableName":"yiqingquyu"
                    }
                ],
                "menu":"疫情区域信息管理"
            }
            ,{
                "child":[
                    {
                        "buttons":[
                            "查看",
                            "新增",
                            "修改",
                            "删除"
                        ],
                        "menu":"居民管理",
                        "menuJump":"列表",
                        "tableName":"yonghu"
                    }
                ],
                "menu":"居民管理"
            }
            ,{
                "child":[
                    {
                        "buttons":[
                            "查看",
                            "新增",
                            "修改",
                            "删除"
                        ],
                        "menu":"住宅信息管理",
                        "menuJump":"列表",
                        "tableName":"zhuzhai"
                    }
                ],
                "menu":"住宅信息管理"
            }
        ],
        "frontMenu":[],
        "hasBackLogin":"是",
        "hasBackRegister":"否",
        "hasFrontLogin":"否",
        "hasFrontRegister":"否",
        "roleName":"管理员",
        "tableName":"users"
    },
	{
	    "backMenu":[
	        {
	            "child":[
	                {
	                    "buttons":[
	                        "查看",
	                        "审核"
	                    ],
	                    "menu":"出入申请管理",
	                    "menuJump":"列表",
	                    "tableName":"churushenhe"
	                }
	            ],
	            "menu":"出入申请管理"
	        }
	        ,{
	            "child":[
	                {
	                    "buttons":[
	                        "查看"
	                    ],
	                    "menu":"公告信息管理",
	                    "menuJump":"列表",
	                    "tableName":"news"
	                }
	            ],
	            "menu":"公告信息管理"
	        }
	        ,{
	            "child":[
	                {
	                    "buttons":[
	                        "查看",
	                        "新增"
	                    ],
	                    "menu":"区域疫情检查管理",
	                    "menuJump":"列表",
	                    "tableName":"quyujiancha"
	                }
	            ],
	            "menu":"区域疫情检查管理"
	        }
	        ,{
	            "child":[
	                {
	                    "buttons":[
	                        "查看"
	                    ],
	                    "menu":"社区信息管理",
	                    "menuJump":"列表",
	                    "tableName":"shequ"
	                }
	            ],
	            "menu":"社区信息管理"
	        }
	        ,{
	            "child":[
	                {
	                    "buttons":[
	                        "查看"
	                    ],
	                    "menu":"社区举报管理",
	                    "menuJump":"列表",
	                    "tableName":"shequjubao"
	                }
	            ],
	            "menu":"社区举报管理"
	        }
			,{
			    "child":[
			        {
			            "buttons":[
			                "查看"
			            ],
			            "menu":"区域分配管理",
			            "menuJump":"列表",
			            "tableName":"shequfenpei"
			        }
			    ],
			    "menu":"区域分配管理"
			}
	        ,{
	            "child":[
	                {
	                    "buttons":[
	                        "查看"
	                    ],
	                    "menu":"疫情区域信息管理",
	                    "menuJump":"列表",
	                    "tableName":"yiqingquyu"
	                }
	            ],
	            "menu":"疫情区域信息管理"
	        }
	    ], 
	    "frontMenu":[],
	    "hasBackLogin":"是",
	    "hasBackRegister":"否",
	    "hasFrontLogin":"否",
	    "hasFrontRegister":"否",
	    "roleName":"工作人员",
	    "tableName":"gongzuorenyuan"
	},
	{
	    "backMenu":[
	        {
	            "child":[
	                {
	                    "buttons":[
	                        "查看",
	                        "新增"
	                    ],
	                    "menu":"出入申请管理",
	                    "menuJump":"列表",
	                    "tableName":"churushenhe"
	                }
	            ],
	            "menu":"出入申请管理"
	        }
	        ,{
	            "child":[
	                {
	                    "buttons":[
	                        "查看"
	                    ],
	                    "menu":"公告信息管理",
	                    "menuJump":"列表",
	                    "tableName":"news"
	                }
	            ],
	            "menu":"公告信息管理"
	        }
	        ,{
	            "child":[
	                {
	                    "buttons":[
	                        "查看"
	                    ],
	                    "menu":"区域疫情检查管理",
	                    "menuJump":"列表",
	                    "tableName":"quyujiancha"
	                }
	            ],
	            "menu":"区域疫情检查管理"
	        }
	        ,{
	            "child":[
	                {
	                    "buttons":[
	                        "查看"
	                    ],
	                    "menu":"社区信息管理",
	                    "menuJump":"列表",
	                    "tableName":"shequ"
	                }
	            ],
	            "menu":"社区信息管理"
	        }
	        ,{
	            "child":[
	                {
	                    "buttons":[
	                        "查看",
	                        "新增"
	                    ],
	                    "menu":"社区举报管理",
	                    "menuJump":"列表",
	                    "tableName":"shequjubao"
	                }
	            ],
	            "menu":"社区举报管理"
	        }
	        ,{
	            "child":[
	                {
	                    "buttons":[
	                        "查看"
	                    ],
	                    "menu":"疫情区域信息管理",
	                    "menuJump":"列表",
	                    "tableName":"yiqingquyu"
	                }
	            ],
	            "menu":"疫情区域信息管理"
	        }
			,{
			    "child":[
			        {
			            "buttons":[
			                "查看"
			            ],
			            "menu":"区域分配管理",
			            "menuJump":"列表",
			            "tableName":"shequfenpei"
			        }
			    ],
			    "menu":"区域分配管理"
			}
	    ],
	    "frontMenu":[],
	    "hasBackLogin":"是",
	    "hasBackRegister":"否",
	    "hasFrontLogin":"否",
	    "hasFrontRegister":"否",
	    "roleName":"居民",
	    "tableName":"yonghu"
	},
]
    }
}
export default menu;
