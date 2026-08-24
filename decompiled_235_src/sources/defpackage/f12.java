package defpackage;

import android.graphics.Bitmap;
import androidx.recyclerview.widget.RecyclerView;
import me.magnum.melonds.translator.ui.GameTranslationOverlayView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: f12  reason: default package */
/* loaded from: classes.dex */
public final class f12 extends hw6 implements eo2 {
    public final /* synthetic */ int X = 3;
    public int Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ Object d0;
    public boolean e0;
    public Object f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f12(gn gnVar, boolean z, sc7 sc7Var, on2 on2Var, r41 r41Var) {
        super(2, r41Var);
        this.f0 = gnVar;
        this.e0 = z;
        this.Z = sc7Var;
        this.d0 = on2Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        w61 w61Var = (w61) obj;
        r41 r41Var = (r41) obj2;
        switch (i) {
            case 0:
                return ((f12) q(r41Var, w61Var)).s(jg7Var);
            case 1:
                return ((f12) q(r41Var, w61Var)).s(jg7Var);
            case 2:
                return ((f12) q(r41Var, w61Var)).s(jg7Var);
            case 3:
                return ((f12) q(r41Var, w61Var)).s(jg7Var);
            default:
                return ((f12) q(r41Var, w61Var)).s(jg7Var);
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        int i = this.X;
        Object obj2 = this.d0;
        Object obj3 = this.Z;
        switch (i) {
            case 0:
                f12 f12Var = new f12((sz1) obj3, (pq5) obj2, this.e0, r41Var);
                f12Var.f0 = obj;
                return f12Var;
            case 1:
                return new f12((sz1) obj3, (pq5) obj2, this.e0, (String) this.f0, r41Var);
            case 2:
                return new f12((hq2) obj3, (ua7) obj2, r41Var);
            case 3:
                return new f12((gn) this.f0, this.e0, (sc7) obj3, (on2) obj2, r41Var);
            default:
                return new f12((qa4) obj3, this.e0, (r94) obj2, r41Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00f8, code lost:
        if (r2 == r0) goto L78;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00ff A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0138  */
    /* JADX WARN: Type inference failed for: r1v22 */
    @Override // defpackage.d20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(Object obj) {
        Object em5Var;
        Object M;
        Bitmap bitmap;
        boolean z;
        Object d0;
        boolean z2;
        Bitmap bitmap2;
        Object N;
        Bitmap bitmap3;
        boolean z3;
        Object N2;
        float f;
        t93 k25Var;
        int i = this.X;
        jg7 jg7Var = jg7.a;
        Object obj2 = this.d0;
        String str = "call to 'resume' before 'invoke' with coroutine";
        Object obj3 = this.Z;
        switch (i) {
            case 0:
                w61 w61Var = (w61) this.f0;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                int i2 = this.Y;
                try {
                    if (i2 != 0) {
                        if (i2 == 1) {
                            oi2.Y(obj);
                            M = obj;
                        } else {
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        oi2.Y(obj);
                        e12 e12Var = new e12((sz1) obj3, (pq5) obj2, this.e0, null, 1);
                        this.f0 = null;
                        this.Y = 1;
                        M = xk2.M(12000L, e12Var, this);
                        if (M == x61Var) {
                            return x61Var;
                        }
                    }
                    em5Var = (kb5) M;
                } catch (Throwable th) {
                    em5Var = new em5(th);
                }
                return new hm5(em5Var);
            case 1:
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                int i3 = this.Y;
                if (i3 != 0) {
                    if (i3 == 1) {
                        oi2.Y(obj);
                        return jg7Var;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                pn5 pn5Var = ((sz1) obj3).g;
                this.Y = 1;
                if (((pl) pn5Var).z(((pq5) obj2).i, this.e0, (String) this.f0, this) == x61Var2) {
                    return x61Var2;
                }
                return jg7Var;
            case 2:
                hq2 hq2Var = (hq2) obj3;
                x61 x61Var3 = x61.COROUTINE_SUSPENDED;
                int i4 = this.Y;
                try {
                } catch (Throwable unused) {
                    bitmap = null;
                    z = str;
                }
                if (i4 != 0) {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 == 3) {
                                z2 = this.e0;
                                bitmap2 = (Bitmap) this.f0;
                                try {
                                    oi2.Y(obj);
                                    N = obj;
                                    bitmap = (Bitmap) N;
                                    z = z2;
                                    bitmap3 = bitmap;
                                    z3 = z;
                                } catch (Throwable unused2) {
                                    bitmap3 = bitmap2;
                                    z3 = z2;
                                    if (z3) {
                                    }
                                    if (bitmap3 != null) {
                                    }
                                }
                                if (z3) {
                                    hq2Var.n = true;
                                    try {
                                        hq2Var.d.c();
                                    } catch (Throwable unused3) {
                                    }
                                }
                                if (bitmap3 != null) {
                                    hq2.f(hq2Var, bitmap3, false, false, hf.b0((ua7) obj2), 6);
                                    return jg7Var;
                                }
                                GameTranslationOverlayView gameTranslationOverlayView = hq2Var.l;
                                if (gameTranslationOverlayView != null) {
                                    gameTranslationOverlayView.setTranslating(false);
                                    return jg7Var;
                                }
                                return jg7Var;
                            }
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        boolean z4 = this.e0;
                        oi2.Y(obj);
                        d0 = obj;
                        z = z4;
                        bitmap = (Bitmap) d0;
                        if (bitmap == null) {
                            try {
                                eq2 eq2Var = new eq2(hq2Var, null, 2);
                                this.f0 = bitmap;
                                this.e0 = z;
                                this.Y = 3;
                                N = xk2.N(500L, eq2Var, this);
                                if (N != x61Var3) {
                                    z2 = z ? 1 : 0;
                                    bitmap2 = bitmap;
                                    bitmap = (Bitmap) N;
                                    z = z2;
                                }
                                return x61Var3;
                            } catch (Throwable unused4) {
                                z2 = z ? 1 : 0;
                                bitmap2 = bitmap;
                                bitmap3 = bitmap2;
                                z3 = z2;
                                if (z3) {
                                }
                                if (bitmap3 != null) {
                                }
                            }
                        }
                        bitmap3 = bitmap;
                        z3 = z;
                        if (z3) {
                        }
                        if (bitmap3 != null) {
                        }
                    } else {
                        boolean z5 = this.e0;
                        oi2.Y(obj);
                        N2 = obj;
                        str = z5;
                    }
                } else {
                    oi2.Y(obj);
                    boolean z6 = hq2Var.f.getBoolean("translator_pause_on_translate", true);
                    eq2 eq2Var2 = new eq2(hq2Var, null, 1);
                    this.e0 = z6;
                    this.Y = 1;
                    N2 = xk2.N(1500L, eq2Var2, this);
                    str = z6;
                    if (N2 == x61Var3) {
                        return x61Var3;
                    }
                }
                bitmap = (Bitmap) N2;
                z = str;
                if (bitmap == null) {
                    this.f0 = null;
                    this.e0 = z;
                    this.Y = 2;
                    xe1 xe1Var = xk1.a;
                    d0 = hv.d0(e04.a, new dq2(hq2Var, null), this);
                    z = z;
                    break;
                }
                if (bitmap == null) {
                }
                bitmap3 = bitmap;
                z3 = z;
                if (z3) {
                }
                if (bitmap3 != null) {
                }
            case 3:
                x61 x61Var4 = x61.COROUTINE_SUSPENDED;
                int i5 = this.Y;
                if (i5 != 0) {
                    if (i5 == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    gn gnVar = (gn) this.f0;
                    if (this.e0) {
                        f = 1.0f;
                    } else {
                        f = RecyclerView.B1;
                    }
                    this.Y = 1;
                    if (gn.c(gnVar, new Float(f), (sc7) obj3, null, this, 12) == x61Var4) {
                        return x61Var4;
                    }
                }
                ((on2) obj2).c();
                return jg7Var;
            default:
                qa4 qa4Var = (qa4) obj3;
                x61 x61Var5 = x61.COROUTINE_SUSPENDED;
                int i6 = this.Y;
                if (i6 != 0) {
                    if (i6 == 1) {
                        qa4Var = (qa4) this.f0;
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    l25 l25Var = (l25) qa4Var.getValue();
                    if (l25Var != null) {
                        r94 r94Var = (r94) obj2;
                        if (this.e0) {
                            k25Var = new m25(l25Var);
                        } else {
                            k25Var = new k25(l25Var);
                        }
                        if (r94Var != null) {
                            this.f0 = qa4Var;
                            this.Y = 1;
                            if (r94Var.a(k25Var, this) == x61Var5) {
                                return x61Var5;
                            }
                        }
                    } else {
                        return jg7Var;
                    }
                }
                qa4Var.setValue(null);
                return jg7Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f12(sz1 sz1Var, pq5 pq5Var, boolean z, r41 r41Var) {
        super(2, r41Var);
        this.Z = sz1Var;
        this.d0 = pq5Var;
        this.e0 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f12(sz1 sz1Var, pq5 pq5Var, boolean z, String str, r41 r41Var) {
        super(2, r41Var);
        this.Z = sz1Var;
        this.d0 = pq5Var;
        this.e0 = z;
        this.f0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f12(hq2 hq2Var, ua7 ua7Var, r41 r41Var) {
        super(2, r41Var);
        this.Z = hq2Var;
        this.d0 = ua7Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f12(qa4 qa4Var, boolean z, r94 r94Var, r41 r41Var) {
        super(2, r41Var);
        this.Z = qa4Var;
        this.e0 = z;
        this.d0 = r94Var;
    }
}
