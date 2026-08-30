package xa;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class z implements ua.v {
    public final p1.a0 A;
    public final ua.b B;
    public final wa.e L;
    public final l R;
    public final ArrayList X;

    public z(p1.a0 a0Var, ua.b bVar, wa.e eVar, l lVar, ArrayList arrayList) {
        this.A = a0Var;
        this.B = bVar;
        this.L = eVar;
        this.R = lVar;
        this.X = arrayList;
    }

    public static void b(Object obj, AccessibleObject accessibleObject) {
        if (Modifier.isStatic(((Member) accessibleObject).getModifiers())) {
            obj = null;
        }
        if (wa.s.f14188a.a(obj, accessibleObject)) {
            return;
        }
        throw new RuntimeException(za.c.d(accessibleObject, true).concat(" is not accessible and ReflectionAccessFilter does not permit making it accessible. Register a TypeAdapter for the declaring type, adjust the access filter or increase the visibility of the element and its declaring type."));
    }

    public static void c(Class cls, String str, Field field, Field field2) {
        throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + str + "'; conflict is caused by fields " + za.c.c(field) + " and " + za.c.c(field2) + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("duplicate-fields"));
    }

    @Override // ua.v
    public final ua.u a(ua.h hVar, bb.a aVar) {
        boolean z10;
        Class cls = aVar.f2155a;
        if (!Object.class.isAssignableFrom(cls)) {
            return null;
        }
        p7.n nVar = za.c.f15005a;
        if (!Modifier.isStatic(cls.getModifiers()) && (cls.isAnonymousClass() || cls.isLocalClass())) {
            return new ua.d(2);
        }
        ua.p e6 = wa.i.e(this.X);
        if (e6 != ua.p.BLOCK_ALL) {
            if (e6 == ua.p.BLOCK_INACCESSIBLE) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (za.c.f15005a.m(cls)) {
                return new y(cls, d(hVar, aVar, cls, z10, true), z10);
            }
            return new w(this.A.w(aVar, true), d(hVar, aVar, cls, z10, false));
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
    /* JADX WARN: Removed duplicated region for block: B:84:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x019b  */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final xa.x d(ua.h r29, bb.a r30, java.lang.Class r31, boolean r32, boolean r33) {
        /*
            Method dump skipped, instructions count: 509
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xa.z.d(ua.h, bb.a, java.lang.Class, boolean, boolean):xa.x");
    }

    public final boolean e(Field field, boolean z10) {
        List list;
        boolean z11;
        wa.e eVar = this.L;
        eVar.getClass();
        if ((136 & field.getModifiers()) != 0 || field.isSynthetic() || eVar.b(field.getType(), z10)) {
            z11 = true;
        } else {
            if (z10) {
                list = eVar.A;
            } else {
                list = eVar.B;
            }
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    throw w.d.k(it);
                }
            }
            z11 = false;
        }
        return !z11;
    }
}
