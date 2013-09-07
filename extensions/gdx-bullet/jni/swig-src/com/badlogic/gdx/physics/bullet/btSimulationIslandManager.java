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

public class btSimulationIslandManager extends BulletBase {
	private long swigCPtr;
	
	protected btSimulationIslandManager(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	protected btSimulationIslandManager(long cPtr, boolean cMemoryOwn) {
		this("btSimulationIslandManager", cPtr, cMemoryOwn);
		construct();
	}
	
	public static long getCPtr(btSimulationIslandManager obj) {
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
				gdxBulletJNI.delete_btSimulationIslandManager(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public btSimulationIslandManager() {
    this(gdxBulletJNI.new_btSimulationIslandManager(), true);
  }

  public void initUnionFind(int n) {
    gdxBulletJNI.btSimulationIslandManager_initUnionFind(swigCPtr, this, n);
  }

  public btUnionFind getUnionFind() {
    return new btUnionFind(gdxBulletJNI.btSimulationIslandManager_getUnionFind(swigCPtr, this), false);
  }

  public void updateActivationState(btCollisionWorld colWorld, btDispatcher dispatcher) {
    gdxBulletJNI.btSimulationIslandManager_updateActivationState(swigCPtr, this, btCollisionWorld.getCPtr(colWorld), colWorld, btDispatcher.getCPtr(dispatcher), dispatcher);
  }

  public void storeIslandActivationState(btCollisionWorld world) {
    gdxBulletJNI.btSimulationIslandManager_storeIslandActivationState(swigCPtr, this, btCollisionWorld.getCPtr(world), world);
  }

  public void findUnions(btDispatcher dispatcher, btCollisionWorld colWorld) {
    gdxBulletJNI.btSimulationIslandManager_findUnions(swigCPtr, this, btDispatcher.getCPtr(dispatcher), dispatcher, btCollisionWorld.getCPtr(colWorld), colWorld);
  }

  public void buildAndProcessIslands(btDispatcher dispatcher, btCollisionWorld collisionWorld, SWIGTYPE_p_btSimulationIslandManager__IslandCallback callback) {
    gdxBulletJNI.btSimulationIslandManager_buildAndProcessIslands(swigCPtr, this, btDispatcher.getCPtr(dispatcher), dispatcher, btCollisionWorld.getCPtr(collisionWorld), collisionWorld, SWIGTYPE_p_btSimulationIslandManager__IslandCallback.getCPtr(callback));
  }

  public void buildIslands(btDispatcher dispatcher, btCollisionWorld colWorld) {
    gdxBulletJNI.btSimulationIslandManager_buildIslands(swigCPtr, this, btDispatcher.getCPtr(dispatcher), dispatcher, btCollisionWorld.getCPtr(colWorld), colWorld);
  }

  public boolean getSplitIslands() {
    return gdxBulletJNI.btSimulationIslandManager_getSplitIslands(swigCPtr, this);
  }

  public void setSplitIslands(boolean doSplitIslands) {
    gdxBulletJNI.btSimulationIslandManager_setSplitIslands(swigCPtr, this, doSplitIslands);
  }

}
