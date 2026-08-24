package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: k84  reason: default package */
/* loaded from: classes.dex */
public final class k84 extends hw6 implements eo2 {
    public zg5 X;
    public zg5 Y;
    public int Z;
    public int d0;
    public /* synthetic */ Object e0;
    public final /* synthetic */ ah5 f0;
    public final /* synthetic */ dh5 g0;
    public final /* synthetic */ dh5 h0;
    public final /* synthetic */ float i0;
    public final /* synthetic */ m84 j0;
    public final /* synthetic */ float k0;
    public final /* synthetic */ m86 l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k84(ah5 ah5Var, dh5 dh5Var, dh5 dh5Var2, float f, m84 m84Var, float f2, m86 m86Var, r41 r41Var) {
        super(2, r41Var);
        this.f0 = ah5Var;
        this.g0 = dh5Var;
        this.h0 = dh5Var2;
        this.i0 = f;
        this.j0 = m84Var;
        this.k0 = f2;
        this.l0 = m86Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        return ((k84) q((r41) obj2, (k86) obj)).s(jg7.a);
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        k84 k84Var = new k84(this.f0, this.g0, this.h0, this.i0, this.j0, this.k0, this.l0, r41Var);
        k84Var.e0 = obj;
        return k84Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01ce A[RETURN] */
    /* JADX WARN: Type inference failed for: r10v0, types: [zg5, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v23, types: [java.lang.Object, ah5] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0073 -> B:14:0x0074). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x018b -> B:37:0x018c). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x01c3 -> B:38:0x0194). Please submit an issue!!! */
    @Override // defpackage.d20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(Object obj) {
        k86 k86Var;
        zg5 zg5Var;
        int i;
        k86 k86Var2;
        int i2;
        zg5 zg5Var2;
        int i3;
        dh5 dh5Var;
        zg5 zg5Var3;
        Object obj2;
        zg5 zg5Var4;
        zg5 zg5Var5;
        ah5 ah5Var;
        dh5 dh5Var2;
        dh5 dh5Var3;
        zg5 zg5Var6;
        int i4;
        boolean z;
        k84 k84Var = this;
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        int i5 = k84Var.d0;
        dh5 dh5Var4 = k84Var.h0;
        zg5 zg5Var7 = null;
        ah5 ah5Var2 = k84Var.f0;
        int i6 = 3;
        int i7 = 2;
        int i8 = 1;
        dh5 dh5Var5 = k84Var.g0;
        if (i5 != 0) {
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 == 3) {
                        zg5 zg5Var8 = k84Var.Y;
                        zg5 zg5Var9 = k84Var.X;
                        oi2.Y(obj);
                        i2 = 2;
                        i = 1;
                        zg5Var = null;
                        dh5Var = dh5Var5;
                        k86Var2 = (k86) k84Var.e0;
                        i3 = 3;
                        zg5Var3 = zg5Var9;
                        zg5 zg5Var10 = zg5Var8;
                        Object d = obj;
                        zg5Var10.A = ((Boolean) d).booleanValue();
                        k86Var = k86Var2;
                        i8 = i;
                        zg5Var7 = zg5Var;
                        zg5Var5 = zg5Var3;
                        i6 = i3;
                        dh5Var5 = dh5Var;
                        i7 = i2;
                        z = zg5Var5.A;
                        jg7 jg7Var = jg7.a;
                        if (!z) {
                            zg5Var5.A = false;
                            float floatValue = ah5Var2.A - ((Number) ((uo) dh5Var5.A).B.getValue()).floatValue();
                            boolean z2 = ((i84) dh5Var4.A).c;
                            m84 m84Var = k84Var.j0;
                            if (!z2) {
                                float abs = Math.abs(floatValue);
                                float f = k84Var.i0;
                                if (abs >= f) {
                                    float signum = Math.signum(floatValue) * f;
                                    m84Var.e(k86Var, signum);
                                    uo uoVar = (uo) dh5Var5.A;
                                    uo O = ak7.O(uoVar, ((Number) uoVar.B.getValue()).floatValue() + signum, RecyclerView.B1, 30);
                                    dh5Var5.A = O;
                                    int E = u24.E(Math.abs(ah5Var2.A - ((Number) O.B.getValue()).floatValue()) / k84Var.k0);
                                    if (E > 100) {
                                        E = 100;
                                    }
                                    uo uoVar2 = (uo) dh5Var5.A;
                                    float f2 = ah5Var2.A;
                                    m84 m84Var2 = k84Var.j0;
                                    int i9 = E;
                                    dh5 dh5Var6 = dh5Var4;
                                    ah5 ah5Var3 = ah5Var2;
                                    dh5Var3 = dh5Var5;
                                    d5 d5Var = new d5(m84Var2, dh5Var6, ah5Var3, k84Var.l0, zg5Var5, 5);
                                    dh5Var2 = dh5Var6;
                                    ah5Var = ah5Var3;
                                    zg5 zg5Var11 = zg5Var5;
                                    k84Var.e0 = k86Var;
                                    k84Var.X = zg5Var11;
                                    k84Var.Y = zg5Var7;
                                    k84Var.Z = i9;
                                    k84Var.d0 = i7;
                                    m84Var2.getClass();
                                    ?? obj3 = new Object();
                                    obj3.A = ((Number) uoVar2.B.getValue()).floatValue();
                                    Float f3 = new Float(f2);
                                    sc7 Y = ge7.Y(i9, 0, ir1.c, i7);
                                    k86Var2 = k86Var;
                                    cn cnVar = new cn((Object) obj3, m84Var2, k86Var2, d5Var, 8);
                                    i2 = i7;
                                    i3 = 3;
                                    i = 1;
                                    Object n = kj2.n(uoVar2, f3, Y, true, cnVar, k84Var);
                                    if (n != x61.COROUTINE_SUSPENDED) {
                                        n = jg7Var;
                                    }
                                    if (n != x61Var) {
                                        i4 = i9;
                                        zg5Var6 = zg5Var11;
                                        if (zg5Var6.A) {
                                            k84Var.e0 = k86Var2;
                                            k84Var.X = zg5Var6;
                                            k84Var.Y = zg5Var6;
                                            k84Var.d0 = i3;
                                            zg5Var = zg5Var7;
                                            dh5Var = dh5Var3;
                                            dh5Var4 = dh5Var2;
                                            ah5Var2 = ah5Var;
                                            d = m84.d(k84Var.j0, dh5Var4, ah5Var2, k84Var.l0, dh5Var, 50 - i4, k84Var);
                                            if (d != x61Var) {
                                                zg5Var3 = zg5Var6;
                                                zg5Var10 = zg5Var6;
                                                zg5Var10.A = ((Boolean) d).booleanValue();
                                                k86Var = k86Var2;
                                                i8 = i;
                                                zg5Var7 = zg5Var;
                                                zg5Var5 = zg5Var3;
                                                i6 = i3;
                                                dh5Var5 = dh5Var;
                                                i7 = i2;
                                                z = zg5Var5.A;
                                                jg7 jg7Var2 = jg7.a;
                                                if (!z) {
                                                    return jg7Var2;
                                                }
                                            }
                                        } else {
                                            i6 = i3;
                                            i7 = i2;
                                            k86Var = k86Var2;
                                            i8 = i;
                                            dh5Var5 = dh5Var3;
                                            dh5Var4 = dh5Var2;
                                            ah5Var2 = ah5Var;
                                            zg5Var4 = zg5Var6;
                                            zg5Var5 = zg5Var4;
                                            z = zg5Var5.A;
                                            jg7 jg7Var22 = jg7.a;
                                            if (!z) {
                                            }
                                        }
                                    }
                                    return x61Var;
                                }
                            }
                            i2 = i7;
                            i = i8;
                            zg5Var = zg5Var7;
                            dh5Var = dh5Var5;
                            zg5Var2 = zg5Var5;
                            k86Var2 = k86Var;
                            i3 = i6;
                            m84Var.e(k86Var2, floatValue);
                            k84Var.e0 = k86Var2;
                            k84Var.X = zg5Var2;
                            k84Var.Y = zg5Var2;
                            k84Var.d0 = i;
                            obj2 = m84.d(k84Var.j0, dh5Var4, ah5Var2, k84Var.l0, dh5Var, 50L, k84Var);
                            if (obj2 != x61Var) {
                                zg5Var3 = zg5Var2;
                                zg5Var2.A = ((Boolean) obj2).booleanValue();
                                k84Var = this;
                                k86Var = k86Var2;
                                i8 = i;
                                zg5Var7 = zg5Var;
                                zg5Var5 = zg5Var3;
                                i6 = i3;
                                dh5Var5 = dh5Var;
                                i7 = i2;
                                z = zg5Var5.A;
                                jg7 jg7Var222 = jg7.a;
                                if (!z) {
                                }
                            }
                            return x61Var;
                        }
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    i4 = k84Var.Z;
                    zg5 zg5Var12 = k84Var.X;
                    oi2.Y(obj);
                    dh5Var2 = dh5Var4;
                    ah5Var = ah5Var2;
                    i2 = 2;
                    i = 1;
                    dh5Var3 = dh5Var5;
                    k86Var2 = (k86) k84Var.e0;
                    i3 = 3;
                    zg5Var6 = zg5Var12;
                    if (zg5Var6.A) {
                    }
                }
            } else {
                zg5 zg5Var13 = k84Var.Y;
                zg5 zg5Var14 = k84Var.X;
                oi2.Y(obj);
                i2 = 2;
                i = 1;
                zg5Var = null;
                dh5Var = dh5Var5;
                k86Var2 = (k86) k84Var.e0;
                i3 = 3;
                zg5Var3 = zg5Var14;
                zg5Var2 = zg5Var13;
                obj2 = obj;
                zg5Var2.A = ((Boolean) obj2).booleanValue();
                k84Var = this;
                k86Var = k86Var2;
                i8 = i;
                zg5Var7 = zg5Var;
                zg5Var5 = zg5Var3;
                i6 = i3;
                dh5Var5 = dh5Var;
                i7 = i2;
                z = zg5Var5.A;
                jg7 jg7Var2222 = jg7.a;
                if (!z) {
                }
            }
        } else {
            oi2.Y(obj);
            k86Var = (k86) k84Var.e0;
            ?? obj4 = new Object();
            obj4.A = true;
            zg5Var4 = obj4;
            zg5Var5 = zg5Var4;
            z = zg5Var5.A;
            jg7 jg7Var22222 = jg7.a;
            if (!z) {
            }
        }
    }
}
