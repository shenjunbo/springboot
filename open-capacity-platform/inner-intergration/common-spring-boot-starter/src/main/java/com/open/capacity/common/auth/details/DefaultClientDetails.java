package com.open.capacity.common.auth.details;

import java.io.Serializable;

import org.springframework.security.oauth2.provider.client.BaseClientDetails;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
* @author 作者 owen 
* @version 创建时间：2017年11月12日 上午22:57:51
* 客户端应用信息
 * blog: https://blog.51cto.com/13005375 
 * code: https://gitee.com/owenwangwen/open-capacity-platform
 */
@Data
@AllArgsConstructor
@ToString(callSuper=true)
@EqualsAndHashCode(callSuper=true)
public class DefaultClientDetails extends BaseClientDetails implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4996423520248249518L;
	//限流标识
	private long if_limit ;
	//限流次数
	private long limit_count ;

	
	public DefaultClientDetails(String clientId, String resourceIds,
			String scopes, String grantTypes, String authorities,
			String redirectUris) {
		super(  clientId,   resourceIds,
				  scopes,   grantTypes,   authorities,
				  redirectUris);
	}
	
	
}
