package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nv4  reason: default package */
/* loaded from: classes.dex */
public final class nv4 {
    public final gd5 a;
    public final hb4 b;
    public final LinkedHashMap c;
    public final LinkedHashSet d;
    public final LinkedHashSet e;
    public final LinkedHashSet f;
    public final tp6 g;
    public boolean h;
    public final de5 i;

    public nv4(gd5 gd5Var) {
        gd5Var.getClass();
        this.a = gd5Var;
        this.b = new hb4();
        this.c = new LinkedHashMap();
        this.d = new LinkedHashSet();
        this.e = new LinkedHashSet();
        this.f = new LinkedHashSet();
        tp6 a = up6.a(new bv4(gd5Var, yt1.A, lc5.f, false));
        this.g = a;
        this.i = new de5(a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004d A[Catch: all -> 0x005d, TryCatch #0 {all -> 0x005d, blocks: (B:18:0x0045, B:22:0x0055, B:21:0x004d), top: B:28:0x0045 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(long j, s41 s41Var) {
        gv4 gv4Var;
        int i;
        hb4 hb4Var;
        String j2;
        try {
            if (s41Var instanceof gv4) {
                gv4Var = (gv4) s41Var;
                int i2 = gv4Var.d0;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    gv4Var.d0 = i2 - Integer.MIN_VALUE;
                    Object obj = gv4Var.Y;
                    x61 x61Var = x61.COROUTINE_SUSPENDED;
                    i = gv4Var.d0;
                    boolean z = true;
                    if (i == 0) {
                        if (i == 1) {
                            j = gv4Var.R;
                            hb4Var = gv4Var.X;
                            oi2.Y(obj);
                        } else {
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        oi2.Y(obj);
                        hb4 hb4Var2 = this.b;
                        gv4Var.X = hb4Var2;
                        gv4Var.R = j;
                        gv4Var.d0 = 1;
                        if (hb4Var2.e(gv4Var) == x61Var) {
                            return x61Var;
                        }
                        hb4Var = hb4Var2;
                    }
                    j2 = j(j);
                    if (j2 != null) {
                        z = false;
                    } else {
                        this.c.remove(j2);
                        i();
                    }
                    return Boolean.valueOf(z);
                }
            }
            j2 = j(j);
            if (j2 != null) {
            }
            return Boolean.valueOf(z);
        } finally {
            hb4Var.h(null);
        }
        gv4Var = new gv4(this, s41Var);
        Object obj2 = gv4Var.Y;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = gv4Var.d0;
        boolean z2 = true;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004e A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:17:0x004a, B:19:0x004e, B:22:0x0055, B:24:0x0061, B:25:0x0064, B:27:0x006e, B:28:0x0071, B:30:0x0080, B:31:0x0083, B:34:0x0089, B:36:0x0099, B:37:0x009c, B:39:0x00b3, B:40:0x00c0), top: B:45:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0055 A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:17:0x004a, B:19:0x004e, B:22:0x0055, B:24:0x0061, B:25:0x0064, B:27:0x006e, B:28:0x0071, B:30:0x0080, B:31:0x0083, B:34:0x0089, B:36:0x0099, B:37:0x009c, B:39:0x00b3, B:40:0x00c0), top: B:45:0x004a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Enum b(zu4 zu4Var, s41 s41Var) {
        hv4 hv4Var;
        int i;
        hb4 hb4Var;
        fv4 fv4Var;
        LinkedHashSet linkedHashSet = this.e;
        LinkedHashSet linkedHashSet2 = this.d;
        try {
            if (s41Var instanceof hv4) {
                hv4Var = (hv4) s41Var;
                int i2 = hv4Var.d0;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    hv4Var.d0 = i2 - Integer.MIN_VALUE;
                    Object obj = hv4Var.Y;
                    x61 x61Var = x61.COROUTINE_SUSPENDED;
                    i = hv4Var.d0;
                    if (i == 0) {
                        if (i == 1) {
                            hb4 hb4Var2 = hv4Var.X;
                            zu4 zu4Var2 = hv4Var.R;
                            oi2.Y(obj);
                            hb4Var = hb4Var2;
                            zu4Var = zu4Var2;
                        } else {
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        oi2.Y(obj);
                        hv4Var.R = zu4Var;
                        hb4Var = this.b;
                        hv4Var.X = hb4Var;
                        hv4Var.d0 = 1;
                        if (hb4Var.e(hv4Var) == x61Var) {
                            return x61Var;
                        }
                    }
                    if (!this.h) {
                        fv4Var = fv4.CLOSED;
                    } else if (!nb3.k(zu4Var.b(), this.a)) {
                        fv4Var = fv4.CONTEXT_MISMATCH;
                    } else if (linkedHashSet2.contains(zu4Var.c())) {
                        fv4Var = fv4.DUPLICATE_SUBMISSION_ID;
                    } else if (linkedHashSet.contains(new Long(zu4Var.e()))) {
                        fv4Var = fv4.DUPLICATE_NATIVE_SUBMISSION_ID;
                    } else {
                        boolean z = zu4Var instanceof yu4;
                        LinkedHashSet linkedHashSet3 = this.f;
                        if (z && linkedHashSet3.contains(new Long(((yu4) zu4Var).g))) {
                            fv4Var = fv4.DUPLICATE_LEADERBOARD_ATTEMPT_ID;
                        } else {
                            linkedHashSet2.add(zu4Var.c());
                            linkedHashSet.add(new Long(zu4Var.e()));
                            if (zu4Var instanceof yu4) {
                                linkedHashSet3.add(new Long(((yu4) zu4Var).g));
                            }
                            this.c.put(zu4Var.c(), new av4(zu4Var, cv4.RETRYABLE));
                            i();
                            fv4Var = fv4.ADDED;
                        }
                    }
                    hb4Var.h(null);
                    return fv4Var;
                }
            }
            if (!this.h) {
            }
            hb4Var.h(null);
            return fv4Var;
        } catch (Throwable th) {
            hb4Var.h(null);
            throw th;
        }
        hv4Var = new hv4(this, s41Var);
        Object obj2 = hv4Var.Y;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = hv4Var.d0;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0071 A[Catch: all -> 0x00a7, TRY_ENTER, TryCatch #0 {all -> 0x00a7, blocks: (B:17:0x0063, B:20:0x0071, B:21:0x007e, B:23:0x0084, B:25:0x00a3, B:28:0x00a9), top: B:33:0x0063 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(LinkedHashSet linkedHashSet, Set set, Set set2, Set set3, s41 s41Var) {
        iv4 iv4Var;
        int i;
        hb4 hb4Var;
        boolean isEmpty;
        try {
            if (s41Var instanceof iv4) {
                iv4Var = (iv4) s41Var;
                int i2 = iv4Var.g0;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    iv4Var.g0 = i2 - Integer.MIN_VALUE;
                    Object obj = iv4Var.e0;
                    x61 x61Var = x61.COROUTINE_SUSPENDED;
                    i = iv4Var.g0;
                    if (i == 0) {
                        if (i == 1) {
                            hb4 hb4Var2 = iv4Var.d0;
                            set3 = iv4Var.Z;
                            set2 = iv4Var.Y;
                            set = iv4Var.X;
                            LinkedHashSet linkedHashSet2 = iv4Var.R;
                            oi2.Y(obj);
                            hb4Var = hb4Var2;
                            linkedHashSet = linkedHashSet2;
                        } else {
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        oi2.Y(obj);
                        iv4Var.R = linkedHashSet;
                        iv4Var.X = set;
                        iv4Var.Y = set2;
                        iv4Var.Z = set3;
                        hb4Var = this.b;
                        iv4Var.d0 = hb4Var;
                        iv4Var.g0 = 1;
                        if (hb4Var.e(iv4Var) == x61Var) {
                            return x61Var;
                        }
                    }
                    LinkedHashSet K = ii2.K(linkedHashSet, set);
                    isEmpty = K.isEmpty();
                    LinkedHashMap linkedHashMap = this.c;
                    if (!isEmpty) {
                        Set entrySet = linkedHashMap.entrySet();
                        entrySet.getClass();
                        Iterator it = entrySet.iterator();
                        while (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            entry.getClass();
                            if (K.contains(Long.valueOf(((av4) entry.getValue()).a.e()))) {
                                it.remove();
                            }
                        }
                    }
                    final ql1 ql1Var = new ql1(28, set3, set2);
                    linkedHashMap.replaceAll(new BiFunction() { // from class: ev4
                        @Override // java.util.function.BiFunction
                        public final Object apply(Object obj2, Object obj3) {
                            return (av4) ql1.this.o(obj2, obj3);
                        }
                    });
                    i();
                    jg7 jg7Var = jg7.a;
                    hb4Var.h(null);
                    return jg7Var;
                }
            }
            LinkedHashSet K2 = ii2.K(linkedHashSet, set);
            isEmpty = K2.isEmpty();
            LinkedHashMap linkedHashMap2 = this.c;
            if (!isEmpty) {
            }
            final ql1 ql1Var2 = new ql1(28, set3, set2);
            linkedHashMap2.replaceAll(new BiFunction() { // from class: ev4
                @Override // java.util.function.BiFunction
                public final Object apply(Object obj2, Object obj3) {
                    return (av4) ql1.this.o(obj2, obj3);
                }
            });
            i();
            jg7 jg7Var2 = jg7.a;
            hb4Var.h(null);
            return jg7Var2;
        } catch (Throwable th) {
            hb4Var.h(null);
            throw th;
        }
        iv4Var = new iv4(this, s41Var);
        Object obj2 = iv4Var.e0;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = iv4Var.g0;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(s41 s41Var) {
        jv4 jv4Var;
        int i;
        hb4 hb4Var;
        LinkedHashMap linkedHashMap = this.c;
        try {
            if (s41Var instanceof jv4) {
                jv4Var = (jv4) s41Var;
                int i2 = jv4Var.Z;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    jv4Var.Z = i2 - Integer.MIN_VALUE;
                    Object obj = jv4Var.X;
                    x61 x61Var = x61.COROUTINE_SUSPENDED;
                    i = jv4Var.Z;
                    if (i == 0) {
                        if (i == 1) {
                            hb4Var = jv4Var.R;
                            oi2.Y(obj);
                        } else {
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        oi2.Y(obj);
                        hb4 hb4Var2 = this.b;
                        jv4Var.R = hb4Var2;
                        jv4Var.Z = 1;
                        if (hb4Var2.e(jv4Var) == x61Var) {
                            return x61Var;
                        }
                        hb4Var = hb4Var2;
                    }
                    int size = linkedHashMap.size();
                    linkedHashMap.clear();
                    this.d.clear();
                    this.e.clear();
                    this.f.clear();
                    this.h = true;
                    i();
                    return new Integer(size);
                }
            }
            int size2 = linkedHashMap.size();
            linkedHashMap.clear();
            this.d.clear();
            this.e.clear();
            this.f.clear();
            this.h = true;
            i();
            return new Integer(size2);
        } finally {
            hb4Var.h(null);
        }
        jv4Var = new jv4(this, s41Var);
        Object obj2 = jv4Var.X;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = jv4Var.Z;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0078 A[Catch: all -> 0x00a1, TryCatch #0 {all -> 0x00a1, blocks: (B:17:0x0051, B:19:0x0056, B:21:0x005e, B:24:0x0065, B:25:0x0072, B:27:0x0078, B:29:0x0095, B:32:0x00a3, B:35:0x00b2, B:36:0x00b9, B:38:0x00bf, B:39:0x00c9, B:40:0x00d0), top: B:45:0x0051 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b2 A[Catch: all -> 0x00a1, TryCatch #0 {all -> 0x00a1, blocks: (B:17:0x0051, B:19:0x0056, B:21:0x005e, B:24:0x0065, B:25:0x0072, B:27:0x0078, B:29:0x0095, B:32:0x00a3, B:35:0x00b2, B:36:0x00b9, B:38:0x00bf, B:39:0x00c9, B:40:0x00d0), top: B:45:0x0051 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(Set set, gd5 gd5Var, s41 s41Var) {
        kv4 kv4Var;
        int i;
        hb4 hb4Var;
        Set<String> keySet;
        LinkedHashMap linkedHashMap = this.c;
        try {
            if (s41Var instanceof kv4) {
                kv4Var = (kv4) s41Var;
                int i2 = kv4Var.e0;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    kv4Var.e0 = i2 - Integer.MIN_VALUE;
                    Object obj = kv4Var.Z;
                    x61 x61Var = x61.COROUTINE_SUSPENDED;
                    i = kv4Var.e0;
                    if (i == 0) {
                        if (i == 1) {
                            hb4 hb4Var2 = kv4Var.Y;
                            gd5Var = kv4Var.X;
                            oi2.Y(obj);
                            hb4Var = hb4Var2;
                            set = kv4Var.R;
                        } else {
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        oi2.Y(obj);
                        kv4Var.R = set;
                        kv4Var.X = gd5Var;
                        hb4Var = this.b;
                        kv4Var.Y = hb4Var;
                        kv4Var.e0 = 1;
                        if (hb4Var.e(kv4Var) == x61Var) {
                            return x61Var;
                        }
                    }
                    int i3 = 0;
                    if (!this.h && nb3.k(gd5Var, this.a) && !set.isEmpty()) {
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            if (set.contains(new Long(((av4) entry.getValue()).a.e()))) {
                                linkedHashMap2.put(entry.getKey(), entry.getValue());
                            }
                        }
                        keySet = linkedHashMap2.keySet();
                        if (keySet.size() != set.size()) {
                            for (String str : keySet) {
                                linkedHashMap.remove(str);
                            }
                            i();
                            i3 = keySet.size();
                        }
                    }
                    Integer num = new Integer(i3);
                    hb4Var.h(null);
                    return num;
                }
            }
            int i32 = 0;
            if (!this.h) {
                LinkedHashMap linkedHashMap22 = new LinkedHashMap();
                while (r1.hasNext()) {
                }
                keySet = linkedHashMap22.keySet();
                if (keySet.size() != set.size()) {
                }
            }
            Integer num2 = new Integer(i32);
            hb4Var.h(null);
            return num2;
        } catch (Throwable th) {
            hb4Var.h(null);
            throw th;
        }
        kv4Var = new kv4(this, s41Var);
        Object obj2 = kv4Var.Z;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = kv4Var.e0;
        if (i == 0) {
        }
    }

    public final gd5 f() {
        return this.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004d A[Catch: all -> 0x005b, TryCatch #0 {all -> 0x005b, blocks: (B:18:0x0045, B:22:0x0053, B:21:0x004d), top: B:28:0x0045 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(long j, s41 s41Var) {
        lv4 lv4Var;
        int i;
        hb4 hb4Var;
        String j2;
        boolean k;
        try {
            if (s41Var instanceof lv4) {
                lv4Var = (lv4) s41Var;
                int i2 = lv4Var.d0;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    lv4Var.d0 = i2 - Integer.MIN_VALUE;
                    Object obj = lv4Var.Y;
                    x61 x61Var = x61.COROUTINE_SUSPENDED;
                    i = lv4Var.d0;
                    if (i == 0) {
                        if (i == 1) {
                            j = lv4Var.R;
                            hb4Var = lv4Var.X;
                            oi2.Y(obj);
                        } else {
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        oi2.Y(obj);
                        hb4 hb4Var2 = this.b;
                        lv4Var.X = hb4Var2;
                        lv4Var.R = j;
                        lv4Var.d0 = 1;
                        if (hb4Var2.e(lv4Var) == x61Var) {
                            return x61Var;
                        }
                        hb4Var = hb4Var2;
                    }
                    j2 = j(j);
                    if (j2 != null) {
                        k = false;
                    } else {
                        k = k(j2, cv4.PERMANENT_FAILURE);
                    }
                    return Boolean.valueOf(k);
                }
            }
            j2 = j(j);
            if (j2 != null) {
            }
            return Boolean.valueOf(k);
        } finally {
            hb4Var.h(null);
        }
        lv4Var = new lv4(this, s41Var);
        Object obj2 = lv4Var.Y;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = lv4Var.d0;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004d A[Catch: all -> 0x005b, TryCatch #0 {all -> 0x005b, blocks: (B:18:0x0045, B:22:0x0053, B:21:0x004d), top: B:28:0x0045 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(long j, s41 s41Var) {
        mv4 mv4Var;
        int i;
        hb4 hb4Var;
        String j2;
        boolean k;
        try {
            if (s41Var instanceof mv4) {
                mv4Var = (mv4) s41Var;
                int i2 = mv4Var.d0;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    mv4Var.d0 = i2 - Integer.MIN_VALUE;
                    Object obj = mv4Var.Y;
                    x61 x61Var = x61.COROUTINE_SUSPENDED;
                    i = mv4Var.d0;
                    if (i == 0) {
                        if (i == 1) {
                            j = mv4Var.R;
                            hb4Var = mv4Var.X;
                            oi2.Y(obj);
                        } else {
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        oi2.Y(obj);
                        hb4 hb4Var2 = this.b;
                        mv4Var.X = hb4Var2;
                        mv4Var.R = j;
                        mv4Var.d0 = 1;
                        if (hb4Var2.e(mv4Var) == x61Var) {
                            return x61Var;
                        }
                        hb4Var = hb4Var2;
                    }
                    j2 = j(j);
                    if (j2 != null) {
                        k = false;
                    } else {
                        k = k(j2, cv4.RETRYABLE);
                    }
                    return Boolean.valueOf(k);
                }
            }
            j2 = j(j);
            if (j2 != null) {
            }
            return Boolean.valueOf(k);
        } finally {
            hb4Var.h(null);
        }
        mv4Var = new mv4(this, s41Var);
        Object obj2 = mv4Var.Y;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = mv4Var.d0;
        if (i == 0) {
        }
    }

    public final void i() {
        Collection values = this.c.values();
        values.getClass();
        List<av4> d1 = gt0.d1(values, new su0(new qn2[]{new dv4(0), new dv4(1), new dv4(2)}, 0));
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        for (av4 av4Var : d1) {
            zu4 zu4Var = av4Var.a;
            if (zu4Var instanceof xu4) {
                i++;
            } else if (zu4Var instanceof yu4) {
                i2++;
            } else {
                i.d();
                return;
            }
            int i5 = kc5.a[av4Var.b.ordinal()];
            if (i5 != 1) {
                if (i5 == 2) {
                    i4++;
                } else {
                    i.d();
                    return;
                }
            } else {
                i3++;
            }
        }
        bv4 bv4Var = new bv4(this.a, d1, new lc5(d1.size(), i, i2, i3, i4), this.h);
        tp6 tp6Var = this.g;
        tp6Var.getClass();
        tp6Var.m(null, bv4Var);
    }

    public final String j(long j) {
        Object obj;
        Set entrySet = this.c.entrySet();
        entrySet.getClass();
        Iterator it = entrySet.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((av4) ((Map.Entry) obj).getValue()).a.e() == j) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry == null) {
            return null;
        }
        return (String) entry.getKey();
    }

    public final boolean k(String str, cv4 cv4Var) {
        LinkedHashMap linkedHashMap = this.c;
        av4 av4Var = (av4) linkedHashMap.get(str);
        if (av4Var != null) {
            cv4 cv4Var2 = av4Var.b;
            if (cv4Var2 == cv4Var) {
                return true;
            }
            if (cv4Var2 == cv4.PERMANENT_FAILURE && cv4Var == cv4.RETRYABLE) {
                return false;
            }
            linkedHashMap.put(str, av4.a(av4Var, cv4Var));
            i();
            return true;
        }
        return false;
    }
}
