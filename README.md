# uexCloudAdapte
[TOC]

# 1、简介
 完成网页自动适配
## 1.1、 说明
本插件集成云适配SDK，用于浏览网页时，PC端设计自动适配移动端UI，完成适配。
## 1.2、UI展示
无
## 1.3、 开源源码
无
# 2、API概览
## 2.1、 方法

> ### initSDK 初始化插件接口
`uexCloudAdapte.initSDK();`
**说明:**
初始化uexCloudAdapte插件
**参数:**
| 参数名称 | 参数类型 | 是否必须 | 说明 |
| ------ | ----- | ----- | ------|
| param | String | 是| 该字符串为JSON 格式，参见下方param 列表|

**param列表**

|参数|是否必选|类型|说明|
| ----- | ------- | ------ |
|companyName|是|String|公司域名|
|managerServer|是|String|服务器地址|
|managerProxy|否|String|服务器需要的代理地址|

> ### loginSDK 登录插件接口
`uexCloudAdapte.loginSDK();`
**说明:**
登录uexCloudAdapte插件
**参数:**
无

> ### showCloudAdapte 显示插件接口
`uexCloudAdapte.showCloudAdapte();`
**说明:**
显示uexCloudAdapte插件
**参数:**
| 参数名称 | 参数类型 | 是否必须 | 说明 |
| ------ | ----- | ----- | ------|
| param | String | 是| 该字符串为JSON 格式，参见下方param 列表|

**param列表**

|参数|是否必选|类型|说明|
| ----- | ------- | ------ |
|path|是|String|要打开的urlString|
|urlHost|是|String|打开的url主域名|

**平台支持:**
iOS7.0+

**版本支持:**
4.0.0+

**示例:**

```
var param = {
companyName:"sdk.yunshipei.info",
managerServer:"http://sdk.yunshipei.info",
managerProxy:"",
}
uexCloudAdapte.initSDK(JSON.stringify(param));

uexCloudAdapte.loginSDK();

var param = {
path:"http://oa.yunshipei.com/OAapp/WebObjects/OAapp.woa",
urlHost:"oa.yunshipei.com",
}
uexCloudAdapte.showCloudAdapte(JSON.stringify(param));

```

# 3、更新历史

API 版本： uexCloudAdapte-1.0.0（iOS）
 最近更新时间：2017-09-18
 
|  历史发布版本 | iOS更新  | 安卓更新  |
| ------------ | ------------ | ------------ |
| 1.0.0 | uexCloudAdapte 新增插件 | |
