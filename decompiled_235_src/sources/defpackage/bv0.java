package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bv0  reason: default package */
/* loaded from: classes.dex */
public final class bv0 {
    public final Set a;
    public final Set b;
    public final int c;
    public final sv0 d;
    public final Set e;

    public bv0(HashSet hashSet, HashSet hashSet2, int i, sv0 sv0Var, HashSet hashSet3) {
        this.a = Collections.unmodifiableSet(hashSet);
        this.b = Collections.unmodifiableSet(hashSet2);
        this.c = i;
        this.d = sv0Var;
        this.e = Collections.unmodifiableSet(hashSet3);
    }

    public static dk0 a(Class cls) {
        return new dk0(cls, new Class[0]);
    }

    public static bv0 b(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(cls);
        for (Class cls2 : clsArr) {
            ln2.k(cls2, "Null interface");
        }
        Collections.addAll(hashSet, clsArr);
        return new bv0(new HashSet(hashSet), new HashSet(hashSet2), 0, new u2(obj, 2), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.a.toArray()) + ">{0, type=" + this.c + ", deps=" + Arrays.toString(this.b.toArray()) + "}";
    }
}
