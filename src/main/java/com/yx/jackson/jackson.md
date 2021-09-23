# 1、jackSon 使用
对象封装方:
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME)
@JsonSubTypes({
@JsonSubTypes.Type(value = Student.class,name="student"),
@JsonSubTypes.Type(value = Teacher.class,name="teacher")
})

对象使用方:
@JsonTypeName(value = "teacher")


# 2、使用场景
当一个base 类 - 有很多场景的情况，但是针对使用方，我们需要 仅仅需要将积累进行暴漏即可
