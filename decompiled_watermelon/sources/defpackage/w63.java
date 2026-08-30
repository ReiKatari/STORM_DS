package defpackage;

import java.util.concurrent.ConcurrentHashMap;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: w63  reason: default package */
/* loaded from: classes.dex */
public final class w63 implements ez6 {
    public static final v63 L = new v63(0);
    public static final v63 R = new v63(0);
    public final qh A;
    public final ConcurrentHashMap B = new ConcurrentHashMap();

    public w63(qh qhVar) {
        this.A = qhVar;
    }

    @Override // defpackage.ez6
    public final dz6 a(qo2 qo2Var, n07 n07Var) {
        u63 u63Var = (u63) n07Var.a.getAnnotation(u63.class);
        if (u63Var == null) {
            return null;
        }
        return b(this.A, qo2Var, n07Var, u63Var, true);
    }

    public final dz6 b(qh qhVar, qo2 qo2Var, n07 n07Var, u63 u63Var, boolean z) {
        p83 p83Var;
        v63 v63Var;
        dz6 dz6Var;
        Object d = qhVar.k(new n07(u63Var.value()), true).d();
        boolean nullSafe = u63Var.nullSafe();
        if (d instanceof dz6) {
            dz6Var = (dz6) d;
        } else if (d instanceof ez6) {
            ez6 ez6Var = (ez6) d;
            if (z) {
                ez6 ez6Var2 = (ez6) this.B.putIfAbsent(n07Var.a, ez6Var);
                if (ez6Var2 != null) {
                    ez6Var = ez6Var2;
                }
            }
            dz6Var = ez6Var.a(qo2Var, n07Var);
        } else {
            boolean z2 = d instanceof p83;
            if (!z2 && !(d instanceof i73)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + d.getClass().getName() + " as a @JsonAdapter for " + l07.w0(n07Var.b) + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            i73 i73Var = null;
            if (z2) {
                p83Var = (p83) d;
            } else {
                p83Var = null;
            }
            if (d instanceof i73) {
                i73Var = (i73) d;
            }
            i73 i73Var2 = i73Var;
            if (z) {
                v63Var = L;
            } else {
                v63Var = R;
            }
            dy6 dy6Var = new dy6(p83Var, i73Var2, qo2Var, n07Var, v63Var, nullSafe);
            nullSafe = false;
            dz6Var = dy6Var;
        }
        if (dz6Var != null && nullSafe) {
            return dz6Var.a();
        }
        return dz6Var;
    }
}
