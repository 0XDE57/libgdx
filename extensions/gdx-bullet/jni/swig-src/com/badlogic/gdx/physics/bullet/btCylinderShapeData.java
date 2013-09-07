/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet;

import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class btCylinderShapeData extends BulletBase {
	private long swigCPtr;
	
	protected btCylinderShapeData(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	protected btCylinderShapeData(long cPtr, boolean cMemoryOwn) {
		this("btCylinderShapeData", cPtr, cMemoryOwn);
		construct();
	}
	
	public static long getCPtr(btCylinderShapeData obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	@Override
	protected void finalize() throws Throwable {
		if (!destroyed)
			destroy();
		super.finalize();
	}

  @Override protected synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				gdxBulletJNI.delete_btCylinderShapeData(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public void setConvexInternalShapeData(btConvexInternalShapeData value) {
    gdxBulletJNI.btCylinderShapeData_convexInternalShapeData_set(swigCPtr, this, btConvexInternalShapeData.getCPtr(value), value);
  }

  public btConvexInternalShapeData getConvexInternalShapeData() {
    long cPtr = gdxBulletJNI.btCylinderShapeData_convexInternalShapeData_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btConvexInternalShapeData(cPtr, false);
  }

  public void setUpAxis(int value) {
    gdxBulletJNI.btCylinderShapeData_upAxis_set(swigCPtr, this, value);
  }

  public int getUpAxis() {
    return gdxBulletJNI.btCylinderShapeData_upAxis_get(swigCPtr, this);
  }

  public void setPadding(String value) {
    gdxBulletJNI.btCylinderShapeData_padding_set(swigCPtr, this, value);
  }

  public String getPadding() {
    return gdxBulletJNI.btCylinderShapeData_padding_get(swigCPtr, this);
  }

  public btCylinderShapeData() {
    this(gdxBulletJNI.new_btCylinderShapeData(), true);
  }

}
