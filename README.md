# StudentCurriculum_backEnd_Springboot

/localhost:8401/

# 接口说明

## 1.User

### /user/login

```json
{
  "jobId": "1002",
  "userPassword": "123456"
}
```

```json
{
  "code": 200,
  "message": "Success",
  "data": {
    "data": {
      "userId": "2001",
      "jobId": "1002",
      "userPassword": "123456",
      "userCreateOfTime": "2023-05-27T13:39:47.000+00:00",
      "userRoleId": 2
    },
    "token": "user:token123"
  }
}
```

