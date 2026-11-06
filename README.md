# 医疗管理系统（medical-system）

SpringBoot 医疗管理系统课程项目。

## 技术栈

| 组件 | 版本 |
|------|------|
| JDK | 21 (Microsoft OpenJDK) |
| Spring Boot | 3.5.3 |
| Maven | 3.9.16 |
| MyBatis | 3.0.4 |
| MySQL | 8.0 |

## 分支规范

| 分支 | 用途 |
|------|------|
| `main` | 主分支，只保留稳定版本，只接受来自 `dev` 的合并 |
| `dev` | 日常开发分支，功能稳定后合并入 `main` |
| `feature/xxx` | 功能分支，从 `dev` 拉出，开发完成后合并回 `dev` |

## 标准分层目录结构

```
src/main/java/com/medical/
├── MedicalSystemApplication.java   # 启动类
├── controller/                     # 控制层：接收请求、返回响应
├── service/                        # 业务层：接口
│   └── impl/                       # 业务层：实现
├── mapper/                         # 持久层：MyBatis Mapper 接口
├── entity/                         # 实体层：数据库表对应的实体类
├── config/                         # 配置类
└── common/                         # 通用类：统一响应等
```

## 运行方式

数据库密码通过环境变量 `MYSQL_PASSWORD` 注入（不写入代码仓库）：

```bash
# Windows 设置环境变量（一次性）
setx MYSQL_PASSWORD "你的数据库密码"

# 运行
mvn spring-boot:run
# 或
java -jar target/medical-system-0.0.1-SNAPSHOT.jar
```

访问地址：<http://localhost:8080/api/hello>
