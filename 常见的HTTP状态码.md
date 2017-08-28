<div style="text-align:center;"><p>常见的HTTP状态码</p></div>
<table>
<tr>
   <th></th>
   <th>状态码</th>
   <th>意义</th>
   <th>举例</th>
</tr>
<tr>
   <th rowspan="2">2XX</th>
</tr>
   <tr>
      <td>200</td>
	 <td>OK</td>
	 <td>请求成功，请求所希望的响应头或数据都会随此响应返回</td>
   </tr>
	<tr>
		<th rowspan="4">3XX</th>
	</tr>
	<tr>
		<td>301</td>
		<td>Moved Permanently</td>
		<td>客户请求的文档在其他地方，新的URL在Location头中给出，浏览器应该自动地访问新的URL。</td>
	</tr>
	<tr>
		<td>302</td>
		<td>Found</td>
		<td>类似于301，但新的URL应该被视为临时性的替代，而不是永久性的。</td>
	</tr>
	<tr>
		<td>304</td>
		<td>Not Modified</td>
		<td>客户端有缓冲的文档并发出了一个条件性的请求（一般是提供If-Modified-Since头表示客户只想比指定日期更新的文档）。服务器告诉客户，原来缓冲的文档还可以继续使用。</td>
	</tr>
	<tr>
		<th rowspan="4">4XX</th>
	</tr>
	<tr>
		<td>400</td>
		<td>Bad Request</td>
		<td>请求出现语法错误。</td>
	</tr>
	<tr>
		<td>403</td>
		<td>Forbidden</td>
		<td>资源不可用</td>
	</tr>
	<tr>
		<td>404</td>
		<td>Not Found</td>
		<td>无法找到指定位置的资源</td>
	</tr>
	<tr>
		<th rowspan="5">5XX</th>
	</tr>
	<tr>
		<td>500</td>
		<td>Internal Server Error</td>
		<td>服务器遇到了意料不到的情况，不能完成客户的请求</td>
	</tr>
	<tr>
		<td>502</td>
		<td>Internal Server Error</td>
		<td>服务器作为网关或者代理时，为了完成请求访问下一个服务器，但该服务器返回了非法的应答。</td>
	</tr>
</table>
