# BindAndVolidatorTest
springMVC数据绑定与校验
1、更新 pom.xml增加hibernate-validator
2、修改 web.xml配置 Spring MVC DispatchcerServlet 前端控制器并声明springmvc配置文件所在，配置过滤器，防止乱码，设置欢迎页
3、新建 Spring MVC 配置文，打开注解扫描，配置扫描包，配置视图解析器InternalResourceViewResolver
4、创建实体类（添加数据验证@NotBlank）和实体类控制器（public String register(@Valid  @ModelAttribute("user") User user, Errors errors,Model model)）
5、在webapp/WEB-INF 目录下新建文件夹 views创建要返回的页面（验证数据有误需添加form:errors path="phone" cssStyle="color:red"）



