package com.cg.onlinepizza.dao;

import java.util.List;

import com.cg.onlinepizza.entities.Coupan;
import com.cg.onlinepizza.exceptions.CoupanIdNotFoundException;
import com.cg.onlinepizza.exceptions.InvalidCoupanOperationException;

public interface ICoupanRepository {
	Coupan addCoupans(Coupan coupan);

	Coupan editCoupans(Coupan coupan)throws InvalidCoupanOperationException ;

	Coupan deleteCoupans(int coupanId)throws CoupanIdNotFoundException;

	List<Coupan> viewCoupans();
}
