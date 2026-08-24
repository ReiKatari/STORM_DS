package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: j16  reason: default package */
/* loaded from: classes.dex */
public final class j16 {
    public final ar0 a;
    public final Context b;
    public final String c;
    public Executor f;
    public Executor g;
    public h61 h;
    public boolean i;
    public boolean q;
    public boolean r;
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final l16 j = l16.AUTOMATIC;
    public final long k = -1;
    public final wb1 l = new wb1(7, (byte) 0);
    public final LinkedHashSet m = new LinkedHashSet();
    public final LinkedHashSet n = new LinkedHashSet();
    public final ArrayList o = new ArrayList();
    public boolean p = true;
    public final boolean s = true;

    public j16(Context context, Class cls, String str) {
        this.a = gh5.a(cls);
        this.b = context;
        this.c = str;
    }

    public final void a(i64... i64VarArr) {
        for (i64 i64Var : i64VarArr) {
            Integer valueOf = Integer.valueOf(i64Var.a);
            LinkedHashSet linkedHashSet = this.n;
            linkedHashSet.add(valueOf);
            linkedHashSet.add(Integer.valueOf(i64Var.b));
        }
        i64[] i64VarArr2 = (i64[]) Arrays.copyOf(i64VarArr, i64VarArr.length);
        wb1 wb1Var = this.l;
        wb1Var.getClass();
        for (i64 i64Var2 : i64VarArr2) {
            wb1Var.c(i64Var2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:146:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0358  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final m16 b() {
        boolean z;
        String str;
        ts1 ts1Var;
        pu6 pu6Var;
        ai1 ai1Var;
        pu6 pu6Var2;
        boolean z2;
        Executor executor = this.f;
        if (executor == null && this.g == null) {
            yt ytVar = zt.g;
            this.g = ytVar;
            this.f = ytVar;
        } else if (executor != null && this.g == null) {
            this.g = executor;
        } else if (executor == null) {
            this.f = this.g;
        }
        LinkedHashSet<Number> linkedHashSet = this.n;
        linkedHashSet.getClass();
        LinkedHashSet linkedHashSet2 = this.m;
        linkedHashSet2.getClass();
        if (!linkedHashSet.isEmpty()) {
            for (Number number : linkedHashSet) {
                int intValue = number.intValue();
                if (linkedHashSet2.contains(Integer.valueOf(intValue))) {
                    i.f(lb1.g(intValue, "Inconsistency detected. A Migration was supplied to addMigration() that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(). Start version is: "));
                    return null;
                }
            }
        }
        ou6 ou6Var = this.h;
        if (ou6Var == null) {
            ou6Var = new w31(7);
        }
        ou6 ou6Var2 = ou6Var;
        if (this.k > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (this.c != null) {
                i.h("Required value was null.");
                return null;
            }
            i.h("Cannot create auto-closing database for an in-memory database.");
            return null;
        }
        boolean z3 = this.i;
        l16 l16Var = this.j;
        Context context = this.b;
        l16 resolve$room_runtime = l16Var.resolve$room_runtime(context);
        Executor executor2 = this.f;
        if (executor2 != null) {
            Executor executor3 = this.g;
            if (executor3 != null) {
                bc1 bc1Var = new bc1(context, this.c, ou6Var2, this.l, this.d, z3, resolve$room_runtime, executor2, executor3, null, this.p, this.q, linkedHashSet2, null, null, null, this.e, this.o, this.r, null, null);
                bc1Var.q = this.s;
                ar0 ar0Var = this.a;
                ar0Var.getClass();
                Class a = ar0Var.a();
                a.getClass();
                Package r0 = a.getPackage();
                String str2 = (r0 == null || (str2 = r0.getName()) == null) ? "" : "";
                String canonicalName = a.getCanonicalName();
                canonicalName.getClass();
                if (str2.length() != 0) {
                    canonicalName = canonicalName.substring(str2.length() + 1);
                }
                String replace = canonicalName.replace('.', '_');
                replace.getClass();
                String concat = replace.concat("_Impl");
                try {
                    if (str2.length() == 0) {
                        str = concat;
                    } else {
                        str = str2 + '.' + concat;
                    }
                    Class<?> cls = Class.forName(str, true, a.getClassLoader());
                    cls.getClass();
                    m16 m16Var = (m16) cls.getDeclaredConstructor(null).newInstance(null);
                    m16Var.getClass();
                    m16Var.k = bc1Var.q;
                    try {
                        ts1Var = m16Var.e();
                        ts1Var.getClass();
                    } catch (tg4 unused) {
                        ts1Var = null;
                    }
                    if (ts1Var != null) {
                        m16Var.e = new ai1(bc1Var, ts1Var, new h4(2, m16Var, n16.class, "compatTransactionCoroutineExecute", "compatTransactionCoroutineExecute(Landroidx/room/RoomDatabase;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 1, 0, 9));
                        m16Var.f = m16Var.d();
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        Set i = m16Var.i();
                        List list = bc1Var.n;
                        int size = list.size();
                        boolean[] zArr = new boolean[size];
                        Iterator it = i.iterator();
                        while (true) {
                            int i2 = -1;
                            if (it.hasNext()) {
                                ar0 ar0Var2 = (ar0) it.next();
                                int size2 = list.size() - 1;
                                if (size2 >= 0) {
                                    while (true) {
                                        int i3 = size2 - 1;
                                        if (ar0Var2.d(list.get(size2))) {
                                            zArr[size2] = true;
                                            i2 = size2;
                                            break;
                                        } else if (i3 < 0) {
                                            break;
                                        } else {
                                            size2 = i3;
                                        }
                                    }
                                }
                                if (i2 >= 0) {
                                    linkedHashMap.put(ar0Var2, list.get(i2));
                                } else {
                                    u34.A(ar0Var2.b(), ") is missing in the database configuration.", "A required auto migration spec (");
                                    return null;
                                }
                            } else {
                                int size3 = list.size() - 1;
                                if (size3 >= 0) {
                                    while (true) {
                                        int i4 = size3 - 1;
                                        if (size3 >= size || !zArr[size3]) {
                                            break;
                                        } else if (i4 < 0) {
                                            break;
                                        } else {
                                            size3 = i4;
                                        }
                                    }
                                    i.h("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                                    return null;
                                }
                                for (i64 i64Var : m16Var.c(linkedHashMap)) {
                                    int i5 = i64Var.a;
                                    int i6 = i64Var.b;
                                    wb1 wb1Var = bc1Var.d;
                                    LinkedHashMap linkedHashMap2 = wb1Var.b;
                                    if (linkedHashMap2.containsKey(Integer.valueOf(i5))) {
                                        Map map = (Map) linkedHashMap2.get(Integer.valueOf(i5));
                                        if (map == null) {
                                            map = zt1.A;
                                        }
                                        z2 = map.containsKey(Integer.valueOf(i6));
                                    } else {
                                        z2 = false;
                                    }
                                    if (!z2) {
                                        wb1Var.c(i64Var);
                                    }
                                }
                                LinkedHashMap j = m16Var.j();
                                List list2 = bc1Var.m;
                                boolean[] zArr2 = new boolean[list2.size()];
                                for (Map.Entry entry : j.entrySet()) {
                                    ar0 ar0Var3 = (ar0) entry.getKey();
                                    for (ar0 ar0Var4 : (List) entry.getValue()) {
                                        int size4 = list2.size() - 1;
                                        if (size4 >= 0) {
                                            while (true) {
                                                int i7 = size4 - 1;
                                                if (ar0Var4.d(list2.get(size4))) {
                                                    zArr2[size4] = true;
                                                    break;
                                                } else if (i7 < 0) {
                                                    break;
                                                } else {
                                                    size4 = i7;
                                                }
                                            }
                                        }
                                        size4 = -1;
                                        if (size4 >= 0) {
                                            Object obj = list2.get(size4);
                                            ar0Var4.getClass();
                                            obj.getClass();
                                            m16Var.j.put(ar0Var4, obj);
                                        } else {
                                            throw new IllegalArgumentException(("A required type converter (" + ar0Var4.b() + ") for " + ar0Var3.b() + " is missing in the database configuration.").toString());
                                        }
                                    }
                                }
                                int size5 = list2.size() - 1;
                                if (size5 >= 0) {
                                    while (true) {
                                        int i8 = size5 - 1;
                                        if (zArr2[size5]) {
                                            if (i8 < 0) {
                                                break;
                                            }
                                            size5 = i8;
                                        } else {
                                            u34.C(list2.get(size5), ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.", "Unexpected type converter ");
                                            return null;
                                        }
                                    }
                                }
                                m16Var.c = bc1Var.h;
                                m16Var.d = new zb6(bc1Var.i, 1);
                                Executor executor4 = m16Var.c;
                                if (executor4 != null) {
                                    o41 i9 = g04.i(jw2.y(f04.F(executor4), oi2.c()));
                                    m16Var.a = i9;
                                    l61 l61Var = i9.B;
                                    zb6 zb6Var = m16Var.d;
                                    if (zb6Var != null) {
                                        m16Var.b = l61Var.N(f04.F(zb6Var));
                                        m16Var.h = bc1Var.f;
                                        ai1 ai1Var2 = m16Var.e;
                                        if (ai1Var2 != null) {
                                            pu6 pu6Var3 = (pu6) ai1Var2.h;
                                            if (pu6Var3 != null) {
                                                pu6Var = pu6Var3;
                                                while (!(pu6Var instanceof m05)) {
                                                    if (pu6Var instanceof ah1) {
                                                        pu6Var = ((ah1) pu6Var).e();
                                                    }
                                                }
                                                m05 m05Var = (m05) pu6Var;
                                                ai1Var = m16Var.e;
                                                if (ai1Var == null) {
                                                    pu6 pu6Var4 = (pu6) ai1Var.h;
                                                    if (pu6Var4 != null) {
                                                        pu6Var2 = pu6Var4;
                                                        while (!(pu6Var2 instanceof kx)) {
                                                            if (pu6Var2 instanceof ah1) {
                                                                pu6Var2 = ((ah1) pu6Var2).e();
                                                            }
                                                        }
                                                        kx kxVar = (kx) pu6Var2;
                                                        return m16Var;
                                                    }
                                                    pu6Var2 = null;
                                                    kx kxVar2 = (kx) pu6Var2;
                                                    return m16Var;
                                                }
                                                nb3.a0("connectionManager");
                                                throw null;
                                            }
                                            pu6Var = null;
                                            m05 m05Var2 = (m05) pu6Var;
                                            ai1Var = m16Var.e;
                                            if (ai1Var == null) {
                                            }
                                        } else {
                                            nb3.a0("connectionManager");
                                            throw null;
                                        }
                                    } else {
                                        nb3.a0("internalTransactionExecutor");
                                        throw null;
                                    }
                                } else {
                                    nb3.a0("internalQueryExecutor");
                                    throw null;
                                }
                            }
                        }
                    } else {
                        new ai1(bc1Var, new gn5(m16Var), new h4(2, m16Var, n16.class, "compatTransactionCoroutineExecute", "compatTransactionCoroutineExecute(Landroidx/room/RoomDatabase;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 1, 0, 8));
                        throw null;
                    }
                } catch (ClassNotFoundException e) {
                    throw new RuntimeException("Cannot find implementation for " + a.getCanonicalName() + ". " + concat + " does not exist. Is Room annotation processor correctly configured?", e);
                } catch (IllegalAccessException e2) {
                    throw new RuntimeException("Cannot access the constructor " + a.getCanonicalName(), e2);
                } catch (InstantiationException e3) {
                    throw new RuntimeException("Failed to create an instance of " + a.getCanonicalName(), e3);
                }
            } else {
                i.h("Required value was null.");
                return null;
            }
        } else {
            i.h("Required value was null.");
            return null;
        }
    }
}
