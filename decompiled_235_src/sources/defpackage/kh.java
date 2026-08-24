package defpackage;

import android.content.Context;
import java.io.File;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kh  reason: default package */
/* loaded from: classes.dex */
public final class kh {
    public final Context a;
    public final go3 b = kj2.M(xr3.SYNCHRONIZED, new c5(7));

    public kh(Context context) {
        this.a = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v25, types: [bs6, java.lang.Object] */
    public static final yc1 a(kh khVar, File file) {
        vs0 vs0Var;
        s63 s63Var;
        s63 o;
        Class cls;
        yc1 yc1Var;
        c1 t;
        byte[] array;
        byte[] bArr;
        byte[] bArr2;
        Context context = khVar.a;
        Object value = khVar.b.getValue();
        value.getClass();
        g42 g42Var = g42.AES256_GCM_HKDF_4KB;
        yr6.a();
        byte b = 1;
        pa paVar = new pa(1, false);
        yc1 yc1Var2 = null;
        paVar.B = null;
        paVar.L = null;
        paVar.R = null;
        paVar.X = null;
        paVar.Y = null;
        paVar.Y = g42Var.getKeyTemplate();
        paVar.B = new s35(context, 12);
        paVar.L = new s35(context, 13);
        String concat = "android-keystore://".concat((String) value);
        if (concat.startsWith("android-keystore://")) {
            paVar.R = concat;
            synchronized (paVar) {
                try {
                    if (((String) paVar.R) != null) {
                        paVar.X = paVar.q();
                    }
                    paVar.Z = paVar.p();
                    vs0Var = new vs0(22);
                    s63Var = (s63) paVar.Z;
                } finally {
                }
            }
            synchronized (vs0Var) {
                o = s63Var.o();
            }
            if (((ds6) ai5.e.get(xr6.class)) != null) {
                cls = xr6.class;
            } else {
                cls = null;
            }
            if (cls != null) {
                ii3 ii3Var = (ii3) o.B;
                int i = bk7.a;
                int r = ii3Var.r();
                boolean z = true;
                int i2 = 0;
                boolean z2 = false;
                for (hi3 hi3Var : ii3Var.q()) {
                    if (hi3Var.t() == hh3.ENABLED) {
                        if (hi3Var.u()) {
                            if (hi3Var.s() != jp4.UNKNOWN_PREFIX) {
                                if (hi3Var.t() != hh3.UNKNOWN_STATUS) {
                                    if (hi3Var.r() == r) {
                                        if (!z2) {
                                            z2 = true;
                                        } else {
                                            e41.v("keyset contains multiple primary keys");
                                            return null;
                                        }
                                    }
                                    if (hi3Var.q().q() != ug3.ASYMMETRIC_PUBLIC) {
                                        z = false;
                                    }
                                    i2++;
                                } else {
                                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(hi3Var.r())));
                                }
                            } else {
                                throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(hi3Var.r())));
                            }
                        } else {
                            throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(hi3Var.r())));
                        }
                    }
                }
                if (i2 != 0) {
                    if (!z2 && !z) {
                        e41.v("keyset doesn't contain a valid primary key");
                        return null;
                    }
                    m44 m44Var = new m44(cls);
                    Class cls2 = (Class) m44Var.R;
                    for (hi3 hi3Var2 : ii3Var.q()) {
                        hh3 t2 = hi3Var2.t();
                        hh3 hh3Var = hh3.ENABLED;
                        if (t2 == hh3Var) {
                            String r2 = hi3Var2.q().r();
                            ea0 s = hi3Var2.q().s();
                            zh5 b2 = ai5.b(r2);
                            Set keySet = b2.a.b.keySet();
                            yc1Var = yc1Var2;
                            bb bbVar = b2.a;
                            if (keySet.contains(cls)) {
                                try {
                                    if (!bbVar.b.keySet().contains(cls) && !Void.class.equals(cls)) {
                                        throw new IllegalArgumentException("Given internalKeyMananger " + bbVar.toString() + " does not support primitive class " + cls.getName());
                                    }
                                    try {
                                        switch (bbVar.d) {
                                            case 0:
                                                t = ua.t(s, g82.a());
                                                break;
                                            default:
                                                t = jb.t(s, g82.a());
                                                break;
                                        }
                                        if (!Void.class.equals(cls)) {
                                            bbVar.b(t);
                                            ya yaVar = (ya) bbVar.b.get(cls);
                                            if (yaVar != null) {
                                                Object a = yaVar.a(t);
                                                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) m44Var.B;
                                                if (hi3Var2.t() == hh3Var) {
                                                    int i3 = u71.a[hi3Var2.s().ordinal()];
                                                    if (i3 != b && i3 != 2) {
                                                        if (i3 != 3) {
                                                            if (i3 == 4) {
                                                                array = n16.l;
                                                            } else {
                                                                e41.v("unknown output prefix type");
                                                                return yc1Var;
                                                            }
                                                        } else {
                                                            array = ByteBuffer.allocate(5).put(b).putInt(hi3Var2.r()).array();
                                                        }
                                                    } else {
                                                        array = ByteBuffer.allocate(5).put((byte) 0).putInt(hi3Var2.r()).array();
                                                    }
                                                    hh3 t3 = hi3Var2.t();
                                                    hi3Var2.s();
                                                    y25 y25Var = new y25(a, array, t3);
                                                    ArrayList arrayList = new ArrayList();
                                                    arrayList.add(y25Var);
                                                    byte[] bArr3 = y25Var.b;
                                                    if (bArr3 == null) {
                                                        bArr = yc1Var;
                                                    } else {
                                                        bArr = Arrays.copyOf(bArr3, bArr3.length);
                                                    }
                                                    z25 z25Var = new z25(bArr);
                                                    List list = (List) concurrentHashMap.put(z25Var, Collections.unmodifiableList(arrayList));
                                                    if (list != null) {
                                                        ArrayList arrayList2 = new ArrayList();
                                                        arrayList2.addAll(list);
                                                        arrayList2.add(y25Var);
                                                        concurrentHashMap.put(z25Var, Collections.unmodifiableList(arrayList2));
                                                    }
                                                    if (hi3Var2.r() != ii3Var.r()) {
                                                        continue;
                                                    } else if (y25Var.c == hh3Var) {
                                                        byte[] bArr4 = y25Var.b;
                                                        if (bArr4 == null) {
                                                            bArr2 = yc1Var;
                                                        } else {
                                                            bArr2 = Arrays.copyOf(bArr4, bArr4.length);
                                                        }
                                                        List list2 = (List) ((ConcurrentHashMap) m44Var.B).get(new z25(bArr2));
                                                        if (list2 == null) {
                                                            list2 = Collections.EMPTY_LIST;
                                                        }
                                                        if (!list2.isEmpty()) {
                                                            m44Var.L = y25Var;
                                                        } else {
                                                            i.h("the primary entry cannot be set to an entry which is not held by this primitive set");
                                                            return yc1Var;
                                                        }
                                                    } else {
                                                        i.h("the primary entry has to be ENABLED");
                                                        return yc1Var;
                                                    }
                                                } else {
                                                    e41.v("only ENABLED key is allowed");
                                                    return yc1Var;
                                                }
                                            } else {
                                                throw new IllegalArgumentException("Requested primitive class " + cls.getCanonicalName() + " not supported.");
                                            }
                                        } else {
                                            throw new GeneralSecurityException("Cannot create a primitive for Void");
                                        }
                                    } catch (ub3 e) {
                                        throw new GeneralSecurityException("Failures parsing proto of type ".concat(bbVar.a.getName()), e);
                                    }
                                } catch (IllegalArgumentException e2) {
                                    throw new GeneralSecurityException("Primitive type not supported", e2);
                                }
                            } else {
                                StringBuilder sb = new StringBuilder("Primitive type ");
                                sb.append(cls.getName());
                                sb.append(" not supported by key manager of type ");
                                sb.append(bbVar.getClass());
                                sb.append(", supported primitives: ");
                                Set<Class> keySet2 = b2.a.b.keySet();
                                StringBuilder sb2 = new StringBuilder();
                                boolean z3 = true;
                                for (Class cls3 : keySet2) {
                                    if (!z3) {
                                        sb2.append(", ");
                                    }
                                    sb2.append(cls3.getCanonicalName());
                                    z3 = false;
                                }
                                sb.append(sb2.toString());
                                throw new GeneralSecurityException(sb.toString());
                            }
                        } else {
                            yc1Var = yc1Var2;
                        }
                        b = 1;
                        yc1Var2 = yc1Var;
                    }
                    yc1 yc1Var3 = yc1Var2;
                    if (((ds6) ai5.e.get(xr6.class)) != null) {
                        if (xr6.class.equals(cls2)) {
                            ?? obj = new Object();
                            if (((y25) m44Var.L) != null) {
                                obj.a = m44Var;
                                return new yc1(file, (Object) obj);
                            }
                            e41.v("Missing primary primitive.");
                            return yc1Var3;
                        }
                        throw new GeneralSecurityException("Wrong input primitive class, expected " + xr6.class + ", got " + cls2);
                    }
                    throw new GeneralSecurityException("No wrapper found for ".concat(cls2.getName()));
                }
                e41.v("keyset must contain at least one ENABLED key");
                return null;
            }
            throw new GeneralSecurityException("No wrapper found for ".concat(xr6.class.getName()));
        }
        i.h("key URI must start with android-keystore://");
        return null;
    }
}
