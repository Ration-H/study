# Java基础笔记  

<br/>

##`四大集合`##

| 名称   |              特性                  |            应用场景        |         
|:----------:|               :----:               |             :----:        |        
|ArrayList   |   有序、查询快、增删慢、自动扩容   |  适用于大小不确定的数据集合|  
|LinkedList  | 有序、查询慢、增删快、自动扩容、双向链表 |  适用于频繁增删的数据集合  |  
|ArrayDeque  |   有序、双向队列（队列+栈）   |  工作窃取使用到  |  
|HashMap  |   无序、key唯一   |  存放JSON数据  |  
|LinkedHashMap  |   有序（添加先后排序）、key唯一   |    |  
|TreeMap  |   有序（根据key排序，可实现Comparable或者传入Compartor实现排序）、key唯一   |    |    
|HashSet  |   无序、底层由HashMap实现   |   用于去重 |  
|LinkedHashSet  |   有序（添加先后排序）、底层由LinkedHashMap实现   |    |  
|TreeSet  |   有序（根据key排序，可实现Comparable或者传入Compartor实现排序）、底层由TreeMap实现   |    |  
|Collections  |   集合工具类   | 可为集合排序（sort）、集合与数组的转换等   |     



<br>
##`Throwable类`##  


* Throwable
	* Error
		* OutOfMemoryError
	* Exception 
		* IOException
		* ClassNotFoundException 
		* RuntimeException   
			*NullPointerException 


<br>
##`Maven生命周期`##
clean  
validate  
compile  
test  
package  
verify  
install  
site  
deploy  

`package、install、deploy的区别`
* package命令完成了项目编译、单元测试、打包功能，但没有把打好的可执行jar包（war包或其它形式的包）布署到本地maven仓库和远程maven私服仓库。
* install命令完成了项目编译、单元测试、打包功能，同时把打好的可执行jar包（war包或其它形式的包）布署到本地maven仓库，但没有布署到远程maven私服仓库。
* deploy命令完成了项目编译、单元测试、打包功能，同时把打好的可执行jar包（war包或其它形式的包）布署到本地maven仓库和远程maven私服仓库。
