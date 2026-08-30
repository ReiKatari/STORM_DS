package defpackage;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Message;
import java.util.Iterator;
import java.util.Map;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
import me.magnum.melonds.ui.emulator.EmulatorSurfaceView;
import me.magnum.melonds.ui.emulator.model.VulkanPresentationConfig;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: nr1  reason: default package */
/* loaded from: classes.dex */
public final class nr1 extends nk6 implements aj2 {
    public final /* synthetic */ int X = 2;
    public int Y;
    public int Z;
    public Object c0;
    public final /* synthetic */ Object d0;
    public Object e0;
    public final /* synthetic */ Object f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nr1(ri5 ri5Var, int i, qj4 qj4Var, ki3 ki3Var, pk3 pk3Var, j11 j11Var) {
        super(2, j11Var);
        this.c0 = ri5Var;
        this.Z = i;
        this.d0 = qj4Var;
        this.e0 = ki3Var;
        this.f0 = pk3Var;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.X;
        o27 o27Var = o27.a;
        o31 o31Var = (o31) obj;
        j11 j11Var = (j11) obj2;
        switch (i) {
            case 0:
                return ((nr1) t(j11Var, o31Var)).v(o27Var);
            case 1:
                return ((nr1) t(j11Var, o31Var)).v(o27Var);
            default:
                return ((nr1) t(j11Var, o31Var)).v(o27Var);
        }
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        int i = this.X;
        Object obj2 = this.f0;
        Object obj3 = this.d0;
        switch (i) {
            case 0:
                return new nr1((Map) obj2, (EmulatorActivity) obj3, j11Var);
            case 1:
                return new nr1((ri5) this.c0, this.Z, (qj4) obj3, (ki3) this.e0, (pk3) obj2, j11Var);
            default:
                return new nr1((dd7) this.c0, (EmulatorSurfaceView) obj3, this.Z, (VulkanPresentationConfig) this.e0, (bs5) obj2, j11Var);
        }
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        EmulatorActivity emulatorActivity;
        Iterator it;
        Object obj2;
        Object[] objArr;
        int i = 0;
        boolean z = false;
        switch (this.X) {
            case 0:
                o27 o27Var = o27.a;
                p31 p31Var = p31.COROUTINE_SUSPENDED;
                int i2 = this.Z;
                if (i2 != 0) {
                    if (i2 == 1) {
                        i = this.Y;
                        it = (Iterator) this.e0;
                        emulatorActivity = (EmulatorActivity) this.c0;
                        me2.a0(obj);
                    } else {
                        i.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    me2.a0(obj);
                    emulatorActivity = (EmulatorActivity) this.d0;
                    it = ((Map) this.f0).keySet().iterator();
                }
                while (it.hasNext()) {
                    String str = (String) it.next();
                    pm4 pm4Var = emulatorActivity.E0;
                    if (pm4Var != null) {
                        this.c0 = emulatorActivity;
                        this.e0 = it;
                        this.Y = i;
                        this.Z = 1;
                        h24 h24Var = (h24) pm4Var.c.get(str);
                        if (h24Var == null || (obj2 = h24Var.b(o27Var, this)) != p31.COROUTINE_SUSPENDED) {
                            obj2 = o27Var;
                            continue;
                        }
                        if (obj2 == p31Var) {
                            return p31Var;
                        }
                    } else {
                        b53.g0("permissionHandler");
                        throw null;
                    }
                }
                return o27Var;
            case 1:
                o27 o27Var2 = o27.a;
                ri5 ri5Var = (ri5) this.c0;
                p31 p31Var2 = p31.COROUTINE_SUSPENDED;
                int i3 = this.Y;
                if (i3 != 0) {
                    if (i3 == 1) {
                        me2.a0(obj);
                    } else {
                        i.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    me2.a0(obj);
                    u92 q = se.q(me2.U(new th5(ri5Var, this.Z, (qj4) this.d0, 1)));
                    hc hcVar = new hc(ri5Var, (ki3) this.e0, (pk3) this.f0, 7);
                    this.Y = 1;
                    Object a = q.a(new z6(hcVar, 24), this);
                    if (a != p31Var2) {
                        a = o27Var2;
                    }
                    if (a == p31Var2) {
                        return p31Var2;
                    }
                }
                return o27Var2;
            default:
                p31 p31Var3 = p31.COROUTINE_SUSPENDED;
                int i4 = this.Y;
                if (i4 != 0) {
                    if (i4 == 1) {
                        me2.a0(obj);
                    } else {
                        i.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    me2.a0(obj);
                    bb1 bb1Var = tg1.a;
                    ha1 ha1Var = ha1.L;
                    v74 v74Var = new v74((dd7) this.c0, (bs5) this.f0, null, 27);
                    this.Y = 1;
                    obj = tq5.G(ha1Var, v74Var, this);
                    if (obj == p31Var3) {
                        return p31Var3;
                    }
                }
                Bitmap bitmap = (Bitmap) obj;
                zc7 zc7Var = ((dd7) this.c0).f;
                EmulatorSurfaceView emulatorSurfaceView = (EmulatorSurfaceView) this.d0;
                int i5 = this.Z;
                VulkanPresentationConfig vulkanPresentationConfig = (VulkanPresentationConfig) this.e0;
                zc7Var.getClass();
                emulatorSurfaceView.getClass();
                if (!zc7Var.B) {
                    if (bitmap != null) {
                        bitmap.recycle();
                    }
                } else {
                    dd7 dd7Var = zc7Var.X;
                    synchronized (dd7Var.c) {
                        try {
                            bd7 bd7Var = (bd7) dd7Var.e.get(emulatorSurfaceView);
                            if (bd7Var != null && i5 < bd7Var.a) {
                                objArr = null;
                            } else {
                                dd7Var.e.put(emulatorSurfaceView, new bd7(i5, vulkanPresentationConfig));
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
                        Handler c = zc7Var.c();
                        if (c == null) {
                            if (bitmap != null) {
                                bitmap.recycle();
                            }
                        } else {
                            Message obtainMessage = c.obtainMessage(3, emulatorSurfaceView);
                            ti4 ti4Var = new ti4("generation", Integer.valueOf(i5));
                            if (vulkanPresentationConfig != null) {
                                z = true;
                            }
                            obtainMessage.setData(dk7.k(ti4Var, new ti4("has-config", Boolean.valueOf(z)), new ti4("background-bitmap", bitmap)));
                            try {
                                c.sendMessage(obtainMessage);
                            } catch (IllegalStateException unused) {
                                if (zc7Var.A == c) {
                                    c.removeCallbacksAndMessages(null);
                                    zc7Var.A = null;
                                }
                                if (bitmap != null) {
                                    bitmap.recycle();
                                }
                                obtainMessage.recycle();
                            }
                        }
                    }
                }
                return o27.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nr1(dd7 dd7Var, EmulatorSurfaceView emulatorSurfaceView, int i, VulkanPresentationConfig vulkanPresentationConfig, bs5 bs5Var, j11 j11Var) {
        super(2, j11Var);
        this.c0 = dd7Var;
        this.d0 = emulatorSurfaceView;
        this.Z = i;
        this.e0 = vulkanPresentationConfig;
        this.f0 = bs5Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nr1(Map map, EmulatorActivity emulatorActivity, j11 j11Var) {
        super(2, j11Var);
        this.f0 = map;
        this.d0 = emulatorActivity;
    }
}
