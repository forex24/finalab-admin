package com.bytetcp.finalab.serve.marketNews.service;

import com.bytetcp.finalab.serve.cases.service.IExcelHandler;
import com.bytetcp.finalab.serve.marketNews.domain.MarketNews;

import java.util.List;

/**
 * 案例市场新闻 服务层
 * 
 * @author finalab
 * @date 2019-05-25
 */
public interface IMarketNewsService extends IExcelHandler
{
	/**
     * 查询案例市场新闻信息
     * 
     * @param id 案例市场新闻ID
     * @return 案例市场新闻信息
     */
	public MarketNews selectMarketNewsById(Long id);
	
	/**
     * 查询案例市场新闻列表
     * 
     * @param marketNews 案例市场新闻信息
     * @return 案例市场新闻集合
     */
	public List<MarketNews> selectMarketNewsList(MarketNews marketNews);
	
	/**
     * 新增案例市场新闻
     * 
     * @param marketNews 案例市场新闻信息
     * @return 结果
     */
	public int insertMarketNews(MarketNews marketNews);
	
	/**
     * 修改案例市场新闻
     * 
     * @param marketNews 案例市场新闻信息
     * @return 结果
     */
	public int updateMarketNews(MarketNews marketNews);
		
	/**
     * 删除案例市场新闻信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteMarketNewsByIds(String ids);
	
}
