package sn.thread.basit;

import java.util.List;

/*
 * 通用计数器模块，用于系统内部的请求量计数
 * 多个线程会频繁调用 hit方法
 * 
 * 请分步完成以下要求
 *  1、功能实现
 *  2、线程安全
 *  3、考虑（10000次请求/秒）的性能问题
 *  4、长时间（7*24*356天）运行，内存不会溢出
 */
public interface ICounter {
	//增加计数量，调一次，计数加1
	void hit();
	//获取当前统计数据
	StatData getStat();
}

class StatData{

	//最近10秒的平均计数量
	public int last10SecondAverage;
	//最近10分钟的平均计量数
	public int last10MinuteAverage;
	//最近60分钟的平均计量数
	public int last60MinuteAverage;
	//最近60分钟的计量数
	public List<Integer> last60SecondHistory;
	
}

//TODO 请实现ICounter接口
