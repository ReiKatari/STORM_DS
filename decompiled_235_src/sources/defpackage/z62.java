package defpackage;

import java.lang.reflect.Modifier;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: z62  reason: default package */
/* loaded from: classes.dex */
public final class z62 implements zc7, Cloneable {
    public static final z62 L = new z62();
    public final List A;
    public final List B;

    public z62() {
        List list = Collections.EMPTY_LIST;
        this.A = list;
        this.B = list;
    }

    @Override // defpackage.zc7
    public final yc7 a(su2 su2Var, ie7 ie7Var) {
        Class cls = ie7Var.a;
        boolean b = b(cls, true);
        boolean b2 = b(cls, false);
        if (!b && !b2) {
            return null;
        }
        return new y62(this, b2, b, su2Var, ie7Var);
    }

    public final boolean b(Class cls, boolean z) {
        List list;
        if (!z && !Enum.class.isAssignableFrom(cls)) {
            uj2 uj2Var = oh5.a;
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
        throw i61.j(it);
    }

    public final Object clone() {
        try {
            return (z62) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }
}
