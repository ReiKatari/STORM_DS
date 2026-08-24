package defpackage;

import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zv  reason: default package */
/* loaded from: classes.dex */
public final class zv implements pp6 {
    public final List A;
    public final te7 B;
    public final qn2 L;
    public final vs4 R;
    public boolean X = true;

    public zv(List list, Object obj, te7 te7Var, bt btVar, qn2 qn2Var, rh rhVar) {
        this.A = list;
        this.B = te7Var;
        this.L = qn2Var;
        this.R = np2.Y(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0097 A[Catch: all -> 0x0038, TRY_LEAVE, TryCatch #0 {all -> 0x0038, blocks: (B:14:0x0034, B:34:0x0097, B:21:0x0049, B:23:0x004e, B:27:0x0075, B:32:0x008d), top: B:39:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a2  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0097 -> B:35:0x00a0). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(s41 s41Var) {
        yv yvVar;
        int i;
        qn2 qn2Var;
        vs4 vs4Var;
        int size;
        List list;
        int i2;
        ve7 ve7Var;
        try {
            if (s41Var instanceof yv) {
                yvVar = (yv) s41Var;
                int i3 = yvVar.f0;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    yvVar.f0 = i3 - Integer.MIN_VALUE;
                    Object obj = yvVar.d0;
                    x61 x61Var = x61.COROUTINE_SUSPENDED;
                    i = yvVar.f0;
                    jg7 jg7Var = jg7.a;
                    qn2Var = this.L;
                    vs4Var = this.R;
                    if (i == 0) {
                        if (i != 1) {
                            if (i == 2) {
                                size = yvVar.Z;
                                i2 = yvVar.Y;
                                list = yvVar.R;
                                oi2.Y(obj);
                            } else {
                                i.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                        } else {
                            int i4 = yvVar.Z;
                            int i5 = yvVar.Y;
                            ll5 ll5Var = yvVar.X;
                            List list2 = yvVar.R;
                            oi2.Y(obj);
                            if (obj != null) {
                                te7 te7Var = this.B;
                                vs4Var.setValue(kj2.Z(te7Var.d, obj, ll5Var, te7Var.b, te7Var.c));
                                l61 l61Var = yvVar.B;
                                l61Var.getClass();
                                boolean z = yh2.z(l61Var);
                                this.X = false;
                                ve7Var = new ve7(z, vs4Var.getValue());
                                qn2Var.g(ve7Var);
                                return jg7Var;
                            }
                            yvVar.R = list2;
                            yvVar.X = null;
                            yvVar.Y = i5;
                            yvVar.Z = i4;
                            yvVar.f0 = 2;
                            if (ps7.b(yvVar) == x61Var) {
                                return x61Var;
                            }
                            size = i4;
                            i2 = i5;
                            list = list2;
                        }
                        i2++;
                        if (i2 < size) {
                            ((ll5) list.get(i2)).getClass();
                            i2++;
                            if (i2 < size) {
                                l61 l61Var2 = yvVar.B;
                                l61Var2.getClass();
                                boolean z2 = yh2.z(l61Var2);
                                this.X = false;
                                ve7Var = new ve7(z2, vs4Var.getValue());
                                qn2Var.g(ve7Var);
                                return jg7Var;
                            }
                        }
                    } else {
                        oi2.Y(obj);
                        List list3 = this.A;
                        size = list3.size();
                        list = list3;
                        i2 = 0;
                        if (i2 < size) {
                        }
                    }
                }
            }
            if (i == 0) {
            }
        } catch (Throwable th) {
            l61 l61Var3 = yvVar.B;
            l61Var3.getClass();
            boolean z3 = yh2.z(l61Var3);
            this.X = false;
            qn2Var.g(new ve7(z3, vs4Var.getValue()));
            throw th;
        }
        yvVar = new yv(this, s41Var);
        Object obj2 = yvVar.d0;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = yvVar.f0;
        jg7 jg7Var2 = jg7.a;
        qn2Var = this.L;
        vs4Var = this.R;
    }

    @Override // defpackage.pp6
    public final Object getValue() {
        return this.R.getValue();
    }
}
