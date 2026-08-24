package defpackage;

import java.util.concurrent.ConcurrentHashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ld3  reason: default package */
/* loaded from: classes.dex */
public final class ld3 implements zc7 {
    public static final kd3 L = new kd3(0);
    public static final kd3 R = new kd3(0);
    public final ci A;
    public final ConcurrentHashMap B = new ConcurrentHashMap();

    public ld3(ci ciVar) {
        this.A = ciVar;
    }

    @Override // defpackage.zc7
    public final yc7 a(su2 su2Var, ie7 ie7Var) {
        jd3 jd3Var = (jd3) ie7Var.a.getAnnotation(jd3.class);
        if (jd3Var == null) {
            return null;
        }
        return b(this.A, su2Var, ie7Var, jd3Var, true);
    }

    public final yc7 b(ci ciVar, su2 su2Var, ie7 ie7Var, jd3 jd3Var, boolean z) {
        if3 if3Var;
        kd3 kd3Var;
        yc7 yc7Var;
        Object e = ciVar.l(new ie7(jd3Var.value()), true).e();
        boolean nullSafe = jd3Var.nullSafe();
        if (e instanceof yc7) {
            yc7Var = (yc7) e;
        } else if (e instanceof zc7) {
            zc7 zc7Var = (zc7) e;
            if (z) {
                zc7 zc7Var2 = (zc7) this.B.putIfAbsent(ie7Var.a, zc7Var);
                if (zc7Var2 != null) {
                    zc7Var = zc7Var2;
                }
            }
            yc7Var = zc7Var.a(su2Var, ie7Var);
        } else {
            boolean z2 = e instanceof if3;
            if (!z2 && !(e instanceof be3)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + e.getClass().getName() + " as a @JsonAdapter for " + q60.b0(ie7Var.b) + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            be3 be3Var = null;
            if (z2) {
                if3Var = (if3) e;
            } else {
                if3Var = null;
            }
            if (e instanceof be3) {
                be3Var = (be3) e;
            }
            be3 be3Var2 = be3Var;
            if (z) {
                kd3Var = L;
            } else {
                kd3Var = R;
            }
            yb7 yb7Var = new yb7(if3Var, be3Var2, su2Var, ie7Var, kd3Var, nullSafe);
            nullSafe = false;
            yc7Var = yb7Var;
        }
        if (yc7Var != null && nullSafe) {
            return yc7Var.a();
        }
        return yc7Var;
    }
}
