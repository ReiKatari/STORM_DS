package defpackage;

import java.lang.reflect.Modifier;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: i22  reason: default package */
/* loaded from: classes.dex */
public final class i22 implements ez6, Cloneable {
    public static final i22 L = new i22();
    public final List A;
    public final List B;

    public i22() {
        List list = Collections.EMPTY_LIST;
        this.A = list;
        this.B = list;
    }

    @Override // defpackage.ez6
    public final dz6 a(qo2 qo2Var, n07 n07Var) {
        Class cls = n07Var.a;
        boolean b = b(cls, true);
        boolean b2 = b(cls, false);
        if (!b && !b2) {
            return null;
        }
        return new h22(this, b2, b, qo2Var, n07Var);
    }

    public final boolean b(Class cls, boolean z) {
        List list;
        if (!z && !Enum.class.isAssignableFrom(cls)) {
            hi2 hi2Var = y75.a;
            if (!Modifier.isStatic(cls.getModifiers()) && (cls.isAnonymousClass() || cls.isLocalClass())) {
                return true;
            }
        }
        if (z) {
            list = this.A;
        } else {
            list = this.B;
        }
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return false;
        }
        throw b31.m(it);
    }

    public final Object clone() {
        try {
            return (i22) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }
}
