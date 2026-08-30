package m8;

import a4.n;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.IBinder;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;
import androidx.window.layout.adapter.sidecar.DistinctElementSidecarCallback;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import j8.i;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;
import l.i0;
import m8.g;
import m8.j;
import zb.q;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class j implements a {

    /* renamed from: a  reason: collision with root package name */
    public final SidecarInterface f9350a;

    /* renamed from: b  reason: collision with root package name */
    public final g f9351b;

    /* renamed from: c  reason: collision with root package name */
    public final LinkedHashMap f9352c;

    /* renamed from: d  reason: collision with root package name */
    public final LinkedHashMap f9353d;

    /* renamed from: e  reason: collision with root package name */
    public n f9354e;

    public j(Context context) {
        context.getClass();
        SidecarInterface a10 = i.a(context);
        g gVar = new g();
        this.f9350a = a10;
        this.f9351b = gVar;
        this.f9352c = new LinkedHashMap();
        this.f9353d = new LinkedHashMap();
    }

    public final j8.i a(Activity activity) {
        IBinder iBinder;
        SidecarDeviceState sidecarDeviceState;
        WindowManager.LayoutParams attributes;
        Window window = activity.getWindow();
        SidecarWindowLayoutInfo sidecarWindowLayoutInfo = null;
        if (window != null && (attributes = window.getAttributes()) != null) {
            iBinder = attributes.token;
        } else {
            iBinder = null;
        }
        if (iBinder == null) {
            return new j8.i(q.A);
        }
        SidecarInterface sidecarInterface = this.f9350a;
        if (sidecarInterface != null) {
            sidecarWindowLayoutInfo = sidecarInterface.getWindowLayoutInfo(iBinder);
        }
        SidecarInterface sidecarInterface2 = this.f9350a;
        if (sidecarInterface2 == null || (sidecarDeviceState = sidecarInterface2.getDeviceState()) == null) {
            sidecarDeviceState = new SidecarDeviceState();
        }
        return this.f9351b.c(sidecarWindowLayoutInfo, sidecarDeviceState);
    }

    public final void b(Activity activity) {
        IBinder iBinder;
        boolean z10;
        SidecarInterface sidecarInterface;
        WindowManager.LayoutParams attributes;
        Window window = activity.getWindow();
        if (window != null && (attributes = window.getAttributes()) != null) {
            iBinder = attributes.token;
        } else {
            iBinder = null;
        }
        if (iBinder != null) {
            SidecarInterface sidecarInterface2 = this.f9350a;
            if (sidecarInterface2 != null) {
                sidecarInterface2.onWindowLayoutChangeListenerRemoved(iBinder);
            }
            LinkedHashMap linkedHashMap = this.f9353d;
            z5.a aVar = (z5.a) linkedHashMap.get(activity);
            if (aVar != null) {
                if (activity instanceof n5.a) {
                    ((n5.a) activity).o(aVar);
                }
                linkedHashMap.remove(activity);
            }
            n nVar = this.f9354e;
            if (nVar != null) {
                ReentrantLock reentrantLock = (ReentrantLock) nVar.L;
                reentrantLock.lock();
                try {
                    ((WeakHashMap) nVar.R).put(activity, null);
                } finally {
                    reentrantLock.unlock();
                }
            }
            LinkedHashMap linkedHashMap2 = this.f9352c;
            if (linkedHashMap2.size() == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            linkedHashMap2.remove(iBinder);
            if (z10 && (sidecarInterface = this.f9350a) != null) {
                sidecarInterface.onDeviceStateListenersChanged(true);
            }
        }
    }

    public final void c(IBinder iBinder, Activity activity) {
        SidecarInterface sidecarInterface;
        LinkedHashMap linkedHashMap = this.f9352c;
        linkedHashMap.put(iBinder, activity);
        SidecarInterface sidecarInterface2 = this.f9350a;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerAdded(iBinder);
        }
        if (linkedHashMap.size() == 1 && (sidecarInterface = this.f9350a) != null) {
            sidecarInterface.onDeviceStateListenersChanged(false);
        }
        n nVar = this.f9354e;
        if (nVar != null) {
            nVar.B(activity, a(activity));
        }
        LinkedHashMap linkedHashMap2 = this.f9353d;
        if (linkedHashMap2.get(activity) == null && (activity instanceof n5.a)) {
            h hVar = new h(0, this, activity);
            linkedHashMap2.put(activity, hVar);
            ((n5.a) activity).g(hVar);
        }
    }

    public final void d(i0 i0Var) {
        this.f9354e = new n(i0Var);
        SidecarInterface sidecarInterface = this.f9350a;
        if (sidecarInterface != null) {
            sidecarInterface.setSidecarCallback(new DistinctElementSidecarCallback(this.f9351b, new SidecarInterface.SidecarCallback() { // from class: androidx.window.layout.adapter.sidecar.SidecarCompat$TranslatingCallback
                public void onDeviceStateChanged(SidecarDeviceState sidecarDeviceState) {
                    IBinder iBinder;
                    SidecarInterface sidecarInterface2;
                    Window window;
                    WindowManager.LayoutParams attributes;
                    sidecarDeviceState.getClass();
                    j jVar = j.this;
                    for (Activity activity : j.this.f9352c.values()) {
                        SidecarWindowLayoutInfo sidecarWindowLayoutInfo = null;
                        if (activity != null && (window = activity.getWindow()) != null && (attributes = window.getAttributes()) != null) {
                            iBinder = attributes.token;
                        } else {
                            iBinder = null;
                        }
                        if (iBinder != null && (sidecarInterface2 = jVar.f9350a) != null) {
                            sidecarWindowLayoutInfo = sidecarInterface2.getWindowLayoutInfo(iBinder);
                        }
                        n nVar = jVar.f9354e;
                        if (nVar != null) {
                            nVar.B(activity, jVar.f9351b.c(sidecarWindowLayoutInfo, sidecarDeviceState));
                        }
                    }
                }

                public void onWindowLayoutChanged(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
                    SidecarDeviceState sidecarDeviceState;
                    iBinder.getClass();
                    sidecarWindowLayoutInfo.getClass();
                    Activity activity = (Activity) j.this.f9352c.get(iBinder);
                    if (activity == null) {
                        Log.w("SidecarCompat", "Unable to resolve activity from window token. Missing a call to #onWindowLayoutChangeListenerAdded()?");
                        return;
                    }
                    j jVar = j.this;
                    g gVar = jVar.f9351b;
                    SidecarInterface sidecarInterface2 = jVar.f9350a;
                    if (sidecarInterface2 == null || (sidecarDeviceState = sidecarInterface2.getDeviceState()) == null) {
                        sidecarDeviceState = new SidecarDeviceState();
                    }
                    i c4 = gVar.c(sidecarWindowLayoutInfo, sidecarDeviceState);
                    n nVar = j.this.f9354e;
                    if (nVar != null) {
                        nVar.B(activity, c4);
                    }
                }
            }));
        }
    }

    public final boolean e() {
        Method method;
        Class<?> cls;
        Method method2;
        Class<?> cls2;
        Method method3;
        Class<?> cls3;
        Method method4;
        Class<?> cls4;
        Class<?> cls5;
        Class<?> cls6;
        Class<?> cls7;
        Class<?> cls8;
        try {
            SidecarInterface sidecarInterface = this.f9350a;
            if (sidecarInterface != null && (cls8 = sidecarInterface.getClass()) != null) {
                method = cls8.getMethod("setSidecarCallback", SidecarInterface.SidecarCallback.class);
            } else {
                method = null;
            }
            if (method != null) {
                cls = method.getReturnType();
            } else {
                cls = null;
            }
            Class cls9 = Void.TYPE;
            if (nc.k.a(cls, cls9)) {
                SidecarInterface sidecarInterface2 = this.f9350a;
                if (sidecarInterface2 != null) {
                    sidecarInterface2.getDeviceState();
                }
                SidecarInterface sidecarInterface3 = this.f9350a;
                if (sidecarInterface3 != null) {
                    sidecarInterface3.onDeviceStateListenersChanged(true);
                }
                SidecarInterface sidecarInterface4 = this.f9350a;
                if (sidecarInterface4 != null && (cls7 = sidecarInterface4.getClass()) != null) {
                    method2 = cls7.getMethod("getWindowLayoutInfo", IBinder.class);
                } else {
                    method2 = null;
                }
                if (method2 != null) {
                    cls2 = method2.getReturnType();
                } else {
                    cls2 = null;
                }
                if (nc.k.a(cls2, SidecarWindowLayoutInfo.class)) {
                    SidecarInterface sidecarInterface5 = this.f9350a;
                    if (sidecarInterface5 != null && (cls6 = sidecarInterface5.getClass()) != null) {
                        method3 = cls6.getMethod("onWindowLayoutChangeListenerAdded", IBinder.class);
                    } else {
                        method3 = null;
                    }
                    if (method3 != null) {
                        cls3 = method3.getReturnType();
                    } else {
                        cls3 = null;
                    }
                    if (nc.k.a(cls3, cls9)) {
                        SidecarInterface sidecarInterface6 = this.f9350a;
                        if (sidecarInterface6 != null && (cls5 = sidecarInterface6.getClass()) != null) {
                            method4 = cls5.getMethod("onWindowLayoutChangeListenerRemoved", IBinder.class);
                        } else {
                            method4 = null;
                        }
                        if (method4 != null) {
                            cls4 = method4.getReturnType();
                        } else {
                            cls4 = null;
                        }
                        if (nc.k.a(cls4, cls9)) {
                            SidecarDeviceState sidecarDeviceState = new SidecarDeviceState();
                            try {
                                sidecarDeviceState.posture = 3;
                            } catch (NoSuchFieldError unused) {
                                SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState, 3);
                                Object invoke = SidecarDeviceState.class.getMethod("getPosture", null).invoke(sidecarDeviceState, null);
                                invoke.getClass();
                                if (((Integer) invoke).intValue() != 3) {
                                    throw new Exception("Invalid device posture getter/setter");
                                }
                            }
                            SidecarDisplayFeature sidecarDisplayFeature = new SidecarDisplayFeature();
                            Rect rect = sidecarDisplayFeature.getRect();
                            rect.getClass();
                            sidecarDisplayFeature.setRect(rect);
                            sidecarDisplayFeature.getType();
                            sidecarDisplayFeature.setType(1);
                            SidecarWindowLayoutInfo sidecarWindowLayoutInfo = new SidecarWindowLayoutInfo();
                            try {
                                List list = sidecarWindowLayoutInfo.displayFeatures;
                                return true;
                            } catch (NoSuchFieldError unused2) {
                                ArrayList arrayList = new ArrayList();
                                arrayList.add(sidecarDisplayFeature);
                                SidecarWindowLayoutInfo.class.getMethod("setDisplayFeatures", List.class).invoke(sidecarWindowLayoutInfo, arrayList);
                                Object invoke2 = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", null).invoke(sidecarWindowLayoutInfo, null);
                                invoke2.getClass();
                                if (arrayList.equals((List) invoke2)) {
                                    return true;
                                }
                                throw new Exception("Invalid display feature getter/setter");
                            }
                        }
                        throw new NoSuchMethodException("Illegal return type for 'onWindowLayoutChangeListenerRemoved': " + cls4);
                    }
                    throw new NoSuchMethodException("Illegal return type for 'onWindowLayoutChangeListenerAdded': " + cls3);
                }
                throw new NoSuchMethodException("Illegal return type for 'getWindowLayoutInfo': " + cls2);
            }
            throw new NoSuchMethodException("Illegal return type for 'setSidecarCallback': " + cls);
        } catch (Throwable unused3) {
            return false;
        }
    }
}
