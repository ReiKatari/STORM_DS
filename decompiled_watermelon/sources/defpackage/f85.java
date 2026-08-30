package defpackage;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: f85  reason: default package */
/* loaded from: classes.dex */
public final class f85 implements ez6 {
    public final qh A;
    public final w52 B;
    public final i22 L;
    public final w63 R;
    public final List X;

    public f85(qh qhVar, w52 w52Var, i22 i22Var, w63 w63Var, List list) {
        this.A = qhVar;
        this.B = w52Var;
        this.L = i22Var;
        this.R = w63Var;
        this.X = list;
    }

    public static void b(Object obj, AccessibleObject accessibleObject) {
        if (Modifier.isStatic(((Member) accessibleObject).getModifiers())) {
            obj = null;
        }
        if (u75.a.a(obj, accessibleObject)) {
            return;
        }
        throw new RuntimeException(y75.d(accessibleObject, true).concat(" is not accessible and ReflectionAccessFilter does not permit making it accessible. Register a TypeAdapter for the declaring type, adjust the access filter or increase the visibility of the element and its declaring type."));
    }

    public static void c(Class cls, String str, Field field, Field field2) {
        throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + str + "'; conflict is caused by fields " + y75.c(field) + " and " + y75.c(field2) + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("duplicate-fields"));
    }

    /* JADX WARN: Type inference failed for: r7v5, types: [dz6, java.lang.Object] */
    @Override // defpackage.ez6
    public final dz6 a(qo2 qo2Var, n07 n07Var) {
        boolean z;
        Class cls = n07Var.a;
        if (!Object.class.isAssignableFrom(cls)) {
            return null;
        }
        hi2 hi2Var = y75.a;
        if (!Modifier.isStatic(cls.getModifiers()) && (cls.isAnonymousClass() || cls.isLocalClass())) {
            return new Object();
        }
        r75 A = cg2.A(this.X);
        if (A != r75.BLOCK_ALL) {
            if (A == r75.BLOCK_INACCESSIBLE) {
                z = true;
            } else {
                z = false;
            }
            if (y75.a.F(cls)) {
                return new e85(cls, d(qo2Var, n07Var, cls, z, true), z);
            }
            return new c85(this.A.k(n07Var, true), d(qo2Var, n07Var, cls, z, false));
        }
        throw new RuntimeException("ReflectionAccessFilter does not permit using reflection for " + cls + ". Register a TypeAdapter for this type or adjust the access filter.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x019c  */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.d85 d(defpackage.qo2 r29, defpackage.n07 r30, java.lang.Class r31, boolean r32, boolean r33) {
        /*
            Method dump skipped, instructions count: 510
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f85.d(qo2, n07, java.lang.Class, boolean, boolean):d85");
    }

    public final boolean e(Field field, boolean z) {
        List list;
        boolean z2;
        i22 i22Var = this.L;
        i22Var.getClass();
        if ((136 & field.getModifiers()) != 0 || field.isSynthetic() || i22Var.b(field.getType(), z)) {
            z2 = true;
        } else {
            if (z) {
                list = i22Var.A;
            } else {
                list = i22Var.B;
            }
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    throw b31.m(it);
                }
            }
            z2 = false;
        }
        return !z2;
    }
}
