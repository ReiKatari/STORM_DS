package defpackage;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Message;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
import me.magnum.melonds.ui.emulator.EmulatorSurfaceView;
import me.magnum.melonds.ui.emulator.model.VulkanPresentationConfig;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zv1  reason: default package */
/* loaded from: classes.dex */
public final class zv1 extends hw6 implements eo2 {
    public final /* synthetic */ int X = 1;
    public int Y;
    public int Z;
    public Object d0;
    public final /* synthetic */ Object e0;
    public Object f0;
    public final /* synthetic */ Object g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zv1(hu1 hu1Var, sz1 sz1Var, dy1 dy1Var, c46 c46Var, int i, r41 r41Var) {
        super(2, r41Var);
        this.d0 = hu1Var;
        this.e0 = sz1Var;
        this.f0 = dy1Var;
        this.g0 = c46Var;
        this.Z = i;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        w61 w61Var = (w61) obj;
        r41 r41Var = (r41) obj2;
        switch (i) {
            case 0:
                return ((zv1) q(r41Var, w61Var)).s(jg7Var);
            case 1:
                return ((zv1) q(r41Var, w61Var)).s(jg7Var);
            default:
                return ((zv1) q(r41Var, w61Var)).s(jg7Var);
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        int i = this.X;
        Object obj2 = this.g0;
        Object obj3 = this.e0;
        switch (i) {
            case 0:
                return new zv1((Map) obj2, (EmulatorActivity) obj3, r41Var);
            case 1:
                return new zv1((hu1) this.d0, (sz1) obj3, (dy1) this.f0, (c46) obj2, this.Z, r41Var);
            default:
                return new zv1((xr7) this.d0, (EmulatorSurfaceView) obj3, this.Z, (VulkanPresentationConfig) this.f0, (t26) obj2, r41Var);
        }
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        EmulatorActivity emulatorActivity;
        Iterator it;
        Object obj2;
        Object[] objArr;
        int i = 0;
        boolean z = false;
        switch (this.X) {
            case 0:
                jg7 jg7Var = jg7.a;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                int i2 = this.Z;
                if (i2 != 0) {
                    if (i2 == 1) {
                        i = this.Y;
                        it = (Iterator) this.f0;
                        emulatorActivity = (EmulatorActivity) this.d0;
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    emulatorActivity = (EmulatorActivity) this.e0;
                    it = ((Map) this.g0).keySet().iterator();
                }
                while (it.hasNext()) {
                    String str = (String) it.next();
                    uv4 uv4Var = emulatorActivity.F0;
                    if (uv4Var != null) {
                        this.d0 = emulatorActivity;
                        this.f0 = it;
                        this.Y = i;
                        this.Z = 1;
                        na4 na4Var = (na4) uv4Var.c.get(str);
                        if (na4Var == null || (obj2 = na4Var.a(jg7Var, this)) != x61.COROUTINE_SUSPENDED) {
                            obj2 = jg7Var;
                            continue;
                        }
                        if (obj2 == x61Var) {
                            return x61Var;
                        }
                    } else {
                        nb3.a0("permissionHandler");
                        throw null;
                    }
                }
                return jg7Var;
            case 1:
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                int i3 = this.Y;
                if (i3 != 0) {
                    if (i3 == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    xe1 xe1Var = xk1.a;
                    de1 de1Var = de1.L;
                    b0 b0Var = new b0((sz1) this.e0, (dy1) this.f0, (c46) this.g0, this.Z, (r41) null);
                    this.Y = 1;
                    obj = hv.d0(de1Var, b0Var, this);
                    if (obj == x61Var2) {
                        return x61Var2;
                    }
                }
                ((hu1) this.d0).g((List) obj);
                return jg7.a;
            default:
                x61 x61Var3 = x61.COROUTINE_SUSPENDED;
                int i4 = this.Y;
                if (i4 != 0) {
                    if (i4 == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    xe1 xe1Var2 = xk1.a;
                    de1 de1Var2 = de1.L;
                    bf4 bf4Var = new bf4((xr7) this.d0, (t26) this.g0, null, 28);
                    this.Y = 1;
                    obj = hv.d0(de1Var2, bf4Var, this);
                    if (obj == x61Var3) {
                        return x61Var3;
                    }
                }
                Bitmap bitmap = (Bitmap) obj;
                tr7 tr7Var = ((xr7) this.d0).f;
                EmulatorSurfaceView emulatorSurfaceView = (EmulatorSurfaceView) this.e0;
                int i5 = this.Z;
                VulkanPresentationConfig vulkanPresentationConfig = (VulkanPresentationConfig) this.f0;
                tr7Var.getClass();
                emulatorSurfaceView.getClass();
                if (!tr7Var.B) {
                    if (bitmap != null) {
                        bitmap.recycle();
                    }
                } else {
                    xr7 xr7Var = tr7Var.X;
                    synchronized (xr7Var.c) {
                        try {
                            vr7 vr7Var = (vr7) xr7Var.e.get(emulatorSurfaceView);
                            if (vr7Var != null && i5 < vr7Var.a) {
                                objArr = null;
                            } else {
                                xr7Var.e.put(emulatorSurfaceView, new vr7(i5, vulkanPresentationConfig));
                                objArr = 1;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (objArr == null) {
                        if (bitmap != null) {
                            bitmap.recycle();
                        }
                    } else {
                        Handler c = tr7Var.c();
                        if (c == null) {
                            if (bitmap != null) {
                                bitmap.recycle();
                            }
                        } else {
                            Message obtainMessage = c.obtainMessage(3, emulatorSurfaceView);
                            vr4 vr4Var = new vr4("generation", Integer.valueOf(i5));
                            if (vulkanPresentationConfig != null) {
                                z = true;
                            }
                            obtainMessage.setData(jw2.l(vr4Var, new vr4("has-config", Boolean.valueOf(z)), new vr4("background-bitmap", bitmap)));
                            try {
                                c.sendMessage(obtainMessage);
                            } catch (IllegalStateException unused) {
                                if (tr7Var.A == c) {
                                    c.removeCallbacksAndMessages(null);
                                    tr7Var.A = null;
                                }
                                if (bitmap != null) {
                                    bitmap.recycle();
                                }
                                obtainMessage.recycle();
                            }
                        }
                    }
                }
                return jg7.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zv1(xr7 xr7Var, EmulatorSurfaceView emulatorSurfaceView, int i, VulkanPresentationConfig vulkanPresentationConfig, t26 t26Var, r41 r41Var) {
        super(2, r41Var);
        this.d0 = xr7Var;
        this.e0 = emulatorSurfaceView;
        this.Z = i;
        this.f0 = vulkanPresentationConfig;
        this.g0 = t26Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zv1(Map map, EmulatorActivity emulatorActivity, r41 r41Var) {
        super(2, r41Var);
        this.g0 = map;
        this.e0 = emulatorActivity;
    }
}
