package defpackage;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vh5  reason: default package */
/* loaded from: classes.dex */
public final class vh5 implements zc7 {
    public final ci A;
    public final qa2 B;
    public final z62 L;
    public final ld3 R;
    public final List X;

    public vh5(ci ciVar, qa2 qa2Var, z62 z62Var, ld3 ld3Var, List list) {
        this.A = ciVar;
        this.B = qa2Var;
        this.L = z62Var;
        this.R = ld3Var;
        this.X = list;
    }

    public static void b(Object obj, AccessibleObject accessibleObject) {
        if (Modifier.isStatic(((Member) accessibleObject).getModifiers())) {
            obj = null;
        }
        if (kh5.a.a(obj, accessibleObject)) {
            return;
        }
        throw new RuntimeException(oh5.d(accessibleObject, true).concat(" is not accessible and ReflectionAccessFilter does not permit making it accessible. Register a TypeAdapter for the declaring type, adjust the access filter or increase the visibility of the element and its declaring type."));
    }

    public static void c(Class cls, String str, Field field, Field field2) {
        throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + str + "'; conflict is caused by fields " + oh5.c(field) + " and " + oh5.c(field2) + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("duplicate-fields"));
    }

    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, yc7] */
    @Override // defpackage.zc7
    public final yc7 a(su2 su2Var, ie7 ie7Var) {
        boolean z;
        Class cls = ie7Var.a;
        if (!Object.class.isAssignableFrom(cls)) {
            return null;
        }
        uj2 uj2Var = oh5.a;
        if (!Modifier.isStatic(cls.getModifiers()) && (cls.isAnonymousClass() || cls.isLocalClass())) {
            return new Object();
        }
        hh5 q = nj2.q(this.X);
        if (q != hh5.BLOCK_ALL) {
            if (q == hh5.BLOCK_INACCESSIBLE) {
                z = true;
            } else {
                z = false;
            }
            if (oh5.a.Y(cls)) {
                return new uh5(cls, d(su2Var, ie7Var, cls, z, true), z);
            }
            return new sh5(this.A.l(ie7Var, true), d(su2Var, ie7Var, cls, z, false));
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
    */
    public final th5 d(su2 su2Var, ie7 ie7Var, Class cls, boolean z, boolean z2) {
        boolean z3;
        Method method;
        gc6 gc6Var;
        String value;
        List asList;
        boolean z4;
        ArrayList<String> arrayList;
        String str;
        Class cls2;
        boolean z5;
        int modifiers;
        boolean z6;
        jd3 jd3Var;
        su2 su2Var2;
        int i;
        Field field;
        yc7 yc7Var;
        boolean z7;
        yc7 yc7Var2;
        int i2;
        Field field2;
        qh5 qh5Var;
        yc7 lc3Var;
        if (cls.isInterface()) {
            return th5.c;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        ie7 ie7Var2 = ie7Var;
        boolean z8 = z;
        Class cls3 = cls;
        while (cls3 != Object.class) {
            Field[] declaredFields = cls3.getDeclaredFields();
            boolean z9 = true;
            if (cls3 != cls && declaredFields.length > 0) {
                hh5 q = nj2.q(this.X);
                if (q != hh5.BLOCK_ALL) {
                    if (q == hh5.BLOCK_INACCESSIBLE) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                } else {
                    throw new RuntimeException("ReflectionAccessFilter does not permit using reflection for " + cls3 + " (supertype of " + cls + "). Register a TypeAdapter for this type or adjust the access filter.");
                }
            }
            boolean z10 = z8;
            int length = declaredFields.length;
            int i3 = 0;
            while (i3 < length) {
                Field field3 = declaredFields[i3];
                boolean e = e(field3, z9);
                boolean e2 = e(field3, false);
                if (!e && !e2) {
                    i = i3;
                    z4 = z9;
                    i2 = length;
                } else {
                    if (z2) {
                        if (Modifier.isStatic(field3.getModifiers())) {
                            z3 = false;
                        } else {
                            Method E = oh5.a.E(cls3, field3);
                            if (!z10) {
                                oh5.f(E);
                            }
                            if (E.getAnnotation(gc6.class) != null && field3.getAnnotation(gc6.class) == null) {
                                throw new RuntimeException(lb1.A("@SerializedName on ", oh5.d(E, false), " is not supported"));
                            }
                            z3 = e2;
                            method = E;
                            if (!z10 && method == null) {
                                oh5.f(field3);
                            }
                            Type W = q60.W(ie7Var2.b, cls3, field3.getGenericType(), new HashMap());
                            gc6Var = (gc6) field3.getAnnotation(gc6.class);
                            if (gc6Var != null) {
                                qa2 qa2Var = this.B;
                                value = qa2Var.translateName(field3);
                                asList = qa2Var.alternateNames(field3);
                            } else {
                                value = gc6Var.value();
                                asList = Arrays.asList(gc6Var.alternate());
                            }
                            if (!asList.isEmpty()) {
                                z4 = z9;
                                arrayList = Collections.singletonList(value);
                            } else {
                                z4 = z9;
                                ArrayList arrayList2 = new ArrayList(asList.size() + 1);
                                arrayList2.add(value);
                                arrayList2.addAll(asList);
                                arrayList = arrayList2;
                            }
                            str = (String) arrayList.get(0);
                            ie7 ie7Var3 = new ie7(W);
                            cls2 = ie7Var3.a;
                            if (cls2 == null && cls2.isPrimitive()) {
                                z5 = z4;
                            } else {
                                z5 = false;
                            }
                            modifiers = field3.getModifiers();
                            if (!Modifier.isStatic(modifiers) && Modifier.isFinal(modifiers)) {
                                z6 = z4;
                            } else {
                                z6 = false;
                            }
                            jd3Var = (jd3) field3.getAnnotation(jd3.class);
                            if (jd3Var == null) {
                                field = field3;
                                i = i3;
                                su2Var2 = su2Var;
                                yc7Var = this.R.b(this.A, su2Var2, ie7Var3, jd3Var, false);
                            } else {
                                su2Var2 = su2Var;
                                i = i3;
                                field = field3;
                                yc7Var = null;
                            }
                            if (yc7Var == null) {
                                z7 = z4;
                            } else {
                                z7 = false;
                            }
                            if (yc7Var == null) {
                                yc7Var = su2Var2.d(ie7Var3);
                            }
                            if (!e) {
                                if (z7) {
                                    lc3Var = yc7Var;
                                } else {
                                    lc3Var = new lc3(su2Var2, yc7Var, ie7Var3.b, 2);
                                }
                                yc7Var2 = lc3Var;
                            } else {
                                yc7Var2 = yc7Var;
                            }
                            i2 = length;
                            qh5 qh5Var2 = new qh5(str, field, z10, method, yc7Var2, yc7Var, z5, z6);
                            field2 = field;
                            if (z3) {
                                for (String str2 : arrayList) {
                                    qh5 qh5Var3 = (qh5) linkedHashMap.put(str2, qh5Var2);
                                    if (qh5Var3 != null) {
                                        c(cls, str2, qh5Var3.b, field2);
                                        throw null;
                                    }
                                }
                            }
                            if (e && (qh5Var = (qh5) linkedHashMap2.put(str, qh5Var2)) != null) {
                                c(cls, str, qh5Var.b, field2);
                                throw null;
                            }
                        }
                    } else {
                        z3 = e2;
                    }
                    method = null;
                    if (!z10) {
                        oh5.f(field3);
                    }
                    Type W2 = q60.W(ie7Var2.b, cls3, field3.getGenericType(), new HashMap());
                    gc6Var = (gc6) field3.getAnnotation(gc6.class);
                    if (gc6Var != null) {
                    }
                    if (!asList.isEmpty()) {
                    }
                    str = (String) arrayList.get(0);
                    ie7 ie7Var32 = new ie7(W2);
                    cls2 = ie7Var32.a;
                    if (cls2 == null) {
                    }
                    z5 = false;
                    modifiers = field3.getModifiers();
                    if (!Modifier.isStatic(modifiers)) {
                    }
                    z6 = false;
                    jd3Var = (jd3) field3.getAnnotation(jd3.class);
                    if (jd3Var == null) {
                    }
                    if (yc7Var == null) {
                    }
                    if (yc7Var == null) {
                    }
                    if (!e) {
                    }
                    i2 = length;
                    qh5 qh5Var22 = new qh5(str, field, z10, method, yc7Var2, yc7Var, z5, z6);
                    field2 = field;
                    if (z3) {
                    }
                    if (e) {
                        c(cls, str, qh5Var.b, field2);
                        throw null;
                    }
                    continue;
                }
                i3 = i + 1;
                z9 = z4;
                length = i2;
            }
            ie7Var2 = new ie7(q60.W(ie7Var2.b, cls3, cls3.getGenericSuperclass(), new HashMap()));
            cls3 = ie7Var2.a;
            z8 = z10;
        }
        return new th5(linkedHashMap, new ArrayList(linkedHashMap2.values()));
    }

    public final boolean e(Field field, boolean z) {
        List list;
        boolean z2;
        z62 z62Var = this.L;
        z62Var.getClass();
        if ((136 & field.getModifiers()) != 0 || field.isSynthetic() || z62Var.b(field.getType(), z)) {
            z2 = true;
        } else {
            if (z) {
                list = z62Var.A;
            } else {
                list = z62Var.B;
            }
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    throw i61.j(it);
                }
            }
            z2 = false;
        }
        return !z2;
    }
}
