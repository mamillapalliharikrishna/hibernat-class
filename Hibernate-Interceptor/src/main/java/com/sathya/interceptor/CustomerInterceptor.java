package com.sathya.interceptor;

import java.io.Serializable;
import java.util.Iterator;

import org.hibernate.EmptyInterceptor;
import org.hibernate.type.Type;

import com.sathya.entity.Customer;

public class CustomerInterceptor extends EmptyInterceptor {
	@Override
	public boolean onSave(Object entity, Serializable id, Object[] state, String[] propertyNames, Type[] types) {
		if(entity  instanceof  Customer) {
			Customer   customer=(Customer)entity;
			customer.setLastmodified(new java.util.Date());
		}
		return super.onSave(entity, id, state, propertyNames, types);
	}
	
   @Override
public void preFlush(Iterator entities) {
	if(entities.hasNext()) {
		Object   obj = entities.next();
		if(obj  instanceof  Customer) {
			Customer   customer=(Customer)obj;
			customer.setLastmodified(new java.util.Date());	
		}
	}
	super.preFlush(entities);
}	
	
	/*@Override
	public boolean onFlushDirty(Object entity, Serializable id, Object[] currentState, Object[] previousState,
			String[] propertyNames, Type[] types) {
		System.out.println("onFlushDirty");
		if(entity  instanceof  Customer) {
			Customer   customer=(Customer)entity;
			customer.setLastmodified(new java.util.Date());
		}
		return super.onFlushDirty(entity, id, currentState, previousState, propertyNames, types);
	}*/

}
