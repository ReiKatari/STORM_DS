package defpackage;

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
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xh6  reason: default package */
/* loaded from: classes.dex */
public final class xh6 implements e82 {
    public final SidecarInterface a;
    public final uh6 b;
    public final LinkedHashMap c;
    public final LinkedHashMap d;
    public m44 e;

    public xh6(Context context) {
        context.getClass();
        SidecarInterface a = vh6.a(context);
        uh6 uh6Var = new uh6();
        this.a = a;
        this.b = uh6Var;
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
    }

    public final kv7 a(Activity activity) {
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
            return new kv7(yt1.A);
        }
        SidecarInterface sidecarInterface = this.a;
        if (sidecarInterface != null) {
            sidecarWindowLayoutInfo = sidecarInterface.getWindowLayoutInfo(iBinder);
        }
        SidecarInterface sidecarInterface2 = this.a;
        if (sidecarInterface2 == null || (sidecarDeviceState = sidecarInterface2.getDeviceState()) == null) {
            sidecarDeviceState = new SidecarDeviceState();
        }
        return this.b.c(sidecarWindowLayoutInfo, sidecarDeviceState);
    }

    public final void b(Activity activity) {
        IBinder iBinder;
        boolean z;
        SidecarInterface sidecarInterface;
        WindowManager.LayoutParams attributes;
        Window window = activity.getWindow();
        if (window != null && (attributes = window.getAttributes()) != null) {
            iBinder = attributes.token;
        } else {
            iBinder = null;
        }
        if (iBinder != null) {
            SidecarInterface sidecarInterface2 = this.a;
            if (sidecarInterface2 != null) {
                sidecarInterface2.onWindowLayoutChangeListenerRemoved(iBinder);
            }
            LinkedHashMap linkedHashMap = this.d;
            b31 b31Var = (b31) linkedHashMap.get(activity);
            if (b31Var != null) {
                if (activity instanceof kl4) {
                    ((kl4) activity).l(b31Var);
                }
                linkedHashMap.remove(activity);
            }
            m44 m44Var = this.e;
            if (m44Var != null) {
                ReentrantLock reentrantLock = (ReentrantLock) m44Var.L;
                reentrantLock.lock();
                try {
                    ((WeakHashMap) m44Var.R).put(activity, null);
                } finally {
                    reentrantLock.unlock();
                }
            }
            LinkedHashMap linkedHashMap2 = this.c;
            if (linkedHashMap2.size() == 1) {
                z = true;
            } else {
                z = false;
            }
            linkedHashMap2.remove(iBinder);
            if (z && (sidecarInterface = this.a) != null) {
                sidecarInterface.onDeviceStateListenersChanged(true);
            }
        }
    }

    public final void c(IBinder iBinder, Activity activity) {
        SidecarInterface sidecarInterface;
        LinkedHashMap linkedHashMap = this.c;
        linkedHashMap.put(iBinder, activity);
        SidecarInterface sidecarInterface2 = this.a;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerAdded(iBinder);
        }
        if (linkedHashMap.size() == 1 && (sidecarInterface = this.a) != null) {
            sidecarInterface.onDeviceStateListenersChanged(false);
        }
        m44 m44Var = this.e;
        if (m44Var != null) {
            m44Var.B(activity, a(activity));
        }
        LinkedHashMap linkedHashMap2 = this.d;
        if (linkedHashMap2.get(activity) == null && (activity instanceof kl4)) {
            ri0 ri0Var = new ri0(3, this, activity);
            linkedHashMap2.put(activity, ri0Var);
            ((kl4) activity).k(ri0Var);
        }
    }

    public final void d(s35 s35Var) {
        this.e = new m44(s35Var);
        SidecarInterface sidecarInterface = this.a;
        if (sidecarInterface != null) {
            sidecarInterface.setSidecarCallback(new DistinctElementSidecarCallback(this.b, new SidecarInterface.SidecarCallback() { // from class: androidx.window.layout.adapter.sidecar.SidecarCompat$TranslatingCallback
                public void onDeviceStateChanged(SidecarDeviceState sidecarDeviceState) {
                    IBinder iBinder;
                    SidecarInterface sidecarInterface2;
                    Window window;
                    WindowManager.LayoutParams attributes;
                    sidecarDeviceState.getClass();
                    xh6 xh6Var = xh6.this;
                    for (Activity activity : xh6.this.c.values()) {
                        SidecarWindowLayoutInfo sidecarWindowLayoutInfo = null;
                        if (activity != null && (window = activity.getWindow()) != null && (attributes = window.getAttributes()) != null) {
                            iBinder = attributes.token;
                        } else {
                            iBinder = null;
                        }
                        if (iBinder != null && (sidecarInterface2 = xh6Var.a) != null) {
                            sidecarWindowLayoutInfo = sidecarInterface2.getWindowLayoutInfo(iBinder);
                        }
                        m44 m44Var = xh6Var.e;
                        if (m44Var != null) {
                            m44Var.B(activity, xh6Var.b.c(sidecarWindowLayoutInfo, sidecarDeviceState));
                        }
                    }
                }

                public void onWindowLayoutChanged(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
                    SidecarDeviceState sidecarDeviceState;
                    iBinder.getClass();
                    sidecarWindowLayoutInfo.getClass();
                    Activity activity = (Activity) xh6.this.c.get(iBinder);
                    if (activity == null) {
                        Log.w("SidecarCompat", "Unable to resolve activity from window token. Missing a call to #onWindowLayoutChangeListenerAdded()?");
                        return;
                    }
                    xh6 xh6Var = xh6.this;
                    uh6 uh6Var = xh6Var.b;
                    SidecarInterface sidecarInterface2 = xh6Var.a;
                    if (sidecarInterface2 == null || (sidecarDeviceState = sidecarInterface2.getDeviceState()) == null) {
                        sidecarDeviceState = new SidecarDeviceState();
                    }
                    kv7 c = uh6Var.c(sidecarWindowLayoutInfo, sidecarDeviceState);
                    m44 m44Var = xh6.this.e;
                    if (m44Var != null) {
                        m44Var.B(activity, c);
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
            SidecarInterface sidecarInterface = this.a;
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
            if (nb3.k(cls, cls9)) {
                SidecarInterface sidecarInterface2 = this.a;
                if (sidecarInterface2 != null) {
                    sidecarInterface2.getDeviceState();
                }
                SidecarInterface sidecarInterface3 = this.a;
                if (sidecarInterface3 != null) {
                    sidecarInterface3.onDeviceStateListenersChanged(true);
                }
                SidecarInterface sidecarInterface4 = this.a;
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
                if (nb3.k(cls2, SidecarWindowLayoutInfo.class)) {
                    SidecarInterface sidecarInterface5 = this.a;
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
                    if (nb3.k(cls3, cls9)) {
                        SidecarInterface sidecarInterface6 = this.a;
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
                        if (nb3.k(cls4, cls9)) {
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
