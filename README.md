# StudentCurriculum_backEnd_Springboot

/localhost:8401/

# 接口说明

## 1.User

### /user/login

>POST

```json
{
  "userJobId": "2001",
  "userPassword": "123456"
}
```

```json
{
  "code": 200,
  "message": "Success",
  "data": {
    "data": {
      "userId": 2,
      "userJobId": "2001",
      "userPassword": "123456",
      "userCreateOfTime": "2023-05-30 03:20:12",
      "userRoleId": 2
    },
    "token": "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJhdWQiOiIyMDAxIiwicGFzc3dvcmQiOiIxMjM0NTYiLCJleHAiOjE2ODU1NTA4MTYsImlhdCI6MTY4NTU0NzIxNiwiYWNjb3VudCI6IjIwMDEifQ.vloDOxzIrAWPVMqu6-Qz-fCEiI0izgFoXN4eFKeNxfU"
  }
}
```

### /user/info/token?[token]

该接口用于Token换取数据

>GET
>
>假设[token]:eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJhdWQiOiIyMDAxIiwicGFzc3dvcmQiOiIxMjM0NTYiLCJleHAiOjE2ODU1NTA4MTYsImlhdCI6MTY4NTU0NzIxNiwiYWNjb3VudCI6IjIwMDEifQ.vloDOxzIrAWPVMqu6-Qz-fCEiI0izgFoXN4eFKeNxfU
>
>那么发送的URL的数据为：
>
>```json
>http://localhost:8401/user/info?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJhdWQiOiIyMDAxIiwicGFzc3dvcmQiOiIxMjM0NTYiLCJleHAiOjE2ODU1NTA4MTYsImlhdCI6MTY4NTU0NzIxNiwiYWNjb3VudCI6IjIwMDEifQ.vloDOxzIrAWPVMqu6-Qz-fCEiI0izgFoXN4eFKeNxfU
>```

```json
`GET`
```

```json
{
  "code": 200,
  "message": "Success",
  "data": {
    "userCreateOfTime": "2023-05-30T03:20:12.000+00:00",
    "userRoleId": 2,
    "data": [
      "李云"
    ],
    "userID": 2
  }
}
```

### /user/register

> POST

```json
{
  "userJobId": "3002",
  "userPassword": "123456",
  "userCreateOfTime":"2023-05-30 11:20:02",
  "userRoleId":3
}
```

```json
{
  "code": 403,
  "message": "信息录入失败，学生和教师数据中没有该用户，或者管理员数据冲突",
  "data": null
}
```

```json
{
  "code": 200,
  "message": "Success",
  "data": {
    "data": {
      "userId": 6,
      "userJobId": "3003",
      "userPassword": "123456",
      "userCreateOfTime": "2023-05-30 11:20:02",
      "userRoleId": 3
    }
  }
}
```

### /user/show

> GET

```json
`GET`
```

```json
{
  "code": 200,
  "message": "Success",
  "data": [
    {
      "userId": 1,
      "userJobId": "1001",
      "userPassword": "123456",
      "userCreateOfTime": "2023-05-30 03:20:02",
      "userRoleId": 1
    },
    {
      "userId": 2,
      "userJobId": "2001",
      "userPassword": "123456",
      "userCreateOfTime": "2023-05-30 03:20:12",
      "userRoleId": 2
    },
    {
      "userId": 3,
      "userJobId": "3001",
      "userPassword": "123456",
      "userCreateOfTime": "2023-05-30 03:20:26",
      "userRoleId": 3
    },
    {
      "userId": 5,
      "userJobId": "3002",
      "userPassword": "123456",
      "userCreateOfTime": "2023-05-30 11:20:02",
      "userRoleId": 3
    },
    {
      "userId": 6,
      "userJobId": "3003",
      "userPassword": "123456",
      "userCreateOfTime": "2023-05-30 11:20:02",
      "userRoleId": 3
    }
  ]
}
```

## 2.Teacher(Student同理)

### /teacher/test

> POST

```json
{
  "teacherJobId": "2001",
}
```

```json
true
```

### /teacher/show

> GET

```json
`GET`
```

```json
{
  "code": 200,
  "message": "Success",
  "data": [
    {
      "teacherJobId": "2001",
      "teacherName": "李云",
      "teacherSex": "女",
      "courseId": 1
    },
    {
      "teacherJobId": "2002",
      "teacherName": "轩宁",
      "teacherSex": "女",
      "courseId": 2
    },
    {
      "teacherJobId": "2003",
      "teacherName": "万奕",
      "teacherSex": "女",
      "courseId": 3
    },
    {
      "teacherJobId": "2004",
      "teacherName": "少辰",
      "teacherSex": "男",
      "courseId": 4
    },
    {
      "teacherJobId": "2005",
      "teacherName": "顺古",
      "teacherSex": "男",
      "courseId": 5
    },
    {
      "teacherJobId": "2006",
      "teacherName": "张云",
      "teacherSex": "女",
      "courseId": 6
    },
    {
      "teacherJobId": "2007",
      "teacherName": "李轩宁",
      "teacherSex": "女",
      "courseId": 7
    },
    {
      "teacherJobId": "2008",
      "teacherName": "王万奕",
      "teacherSex": "女",
      "courseId": 8
    },
    {
      "teacherJobId": "2009",
      "teacherName": "李少辰",
      "teacherSex": "男",
      "courseId": 9
    },
    {
      "teacherJobId": "2010",
      "teacherName": "顺拉古",
      "teacherSex": "男",
      "courseId": 10
    },
    {
      "teacherJobId": "2011",
      "teacherName": "小风",
      "teacherSex": "男",
      "courseId": 11
    }
  ]
}
```

### /teacher/add

> POST
>
> BUG：插入冲突判断

```json
{
  "teacherJobId": "2011",
  "teacherName":"东风",
  "teacherSex":"男",
  "courseId":11
}
```

```json
{
  "code": 200,
  "message": "Success",
  "data": {
    "data": [
      {
        "teacherJobId": "2011",
        "teacherName": "东风",
        "teacherSex": "男",
        "courseId": 11
      }
    ]
  }
}
```

### /teacher/del

> POST

```json
{
  "teacherJobId": "2011"
}
```

```json
{
  "code": 200,
  "message": "删除成功 [ 2011 ]",
  "data": null
}
```

### /teacher/change

```json
{
  "teacherJobId": "2011",
  "teacherName":"小风",
  "teacherSex":"男",
  "courseId":11
}
```

```json
{
  "code": 200,
  "message": "Success",
  "data": {
    "data": {
      "teacherJobId": "2011",
      "teacherName": "小风",
      "teacherSex": "男",
      "courseId": 11
    }
  }
}
```

## 3.Student(同上，数据字段改名)
