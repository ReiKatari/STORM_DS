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
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: yg  reason: default package */
/* loaded from: classes.dex */
public final class yg {
    public final Context a;
    public final gh3 b = yf2.H(wk3.SYNCHRONIZED, new d5(7));

    public yg(Context context) {
        this.a = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kg6] */
    public static final k91 a(yg ygVar, File file) {
        k45 k45Var;
        ka3 ka3Var;
        ka3 x;
        Class cls;
        k91 k91Var;
        b1 t;
        byte[] array;
        byte[] bArr;
        byte[] bArr2;
        Context context = ygVar.a;
        Object value = ygVar.b.getValue();
        value.getClass();
        rz1 rz1Var = rz1.AES256_GCM_HKDF_4KB;
        hg6.a();
        byte b = 1;
        ka kaVar = new ka(1, false);
        k91 k91Var2 = null;
        kaVar.B = null;
        kaVar.L = null;
        kaVar.R = null;
        kaVar.X = null;
        kaVar.Y = null;
        kaVar.Y = rz1Var.getKeyTemplate();
        kaVar.B = new dz4(context, 9);
        kaVar.L = new dz4(context, 10);
        String concat = "android-keystore://".concat((String) value);
        if (concat.startsWith("android-keystore://")) {
            kaVar.R = concat;
            synchronized (kaVar) {
                try {
                    if (((String) kaVar.R) != null) {
                        kaVar.X = kaVar.o();
                    }
                    kaVar.Z = kaVar.n();
                    k45Var = new k45(20);
                    ka3Var = (ka3) kaVar.Z;
                } finally {
                }
            }
            synchronized (k45Var) {
                x = ka3Var.x();
            }
            if (((mg6) k85.e.get(gg6.class)) != null) {
                cls = gg6.class;
            } else {
                cls = null;
            }
            if (cls != null) {
                qb3 qb3Var = (qb3) x.B;
                int i = d67.a;
                int r = qb3Var.r();
                boolean z = true;
                int i2 = 0;
                boolean z2 = false;
                for (pb3 pb3Var : qb3Var.q()) {
                    if (pb3Var.t() == pa3.ENABLED) {
                        if (pb3Var.u()) {
                            if (pb3Var.s() != gg4.UNKNOWN_PREFIX) {
                                if (pb3Var.t() != pa3.UNKNOWN_STATUS) {
                                    if (pb3Var.r() == r) {
                                        if (!z2) {
                                            z2 = true;
                                        } else {
                                            f81.u("keyset contains multiple primary keys");
                                            return null;
                                        }
                                    }
                                    if (pb3Var.q().q() != ba3.ASYMMETRIC_PUBLIC) {
                                        z = false;
                                    }
                                    i2++;
                                } else {
                                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(pb3Var.r())));
                                }
                            } else {
                                throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(pb3Var.r())));
                            }
                        } else {
                            throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(pb3Var.r())));
                        }
                    }
                }
                if (i2 != 0) {
                    if (!z2 && !z) {
                        f81.u("keyset doesn't contain a valid primary key");
                        return null;
                    }
                    os osVar = new os(cls);
                    Class cls2 = (Class) osVar.R;
                    for (pb3 pb3Var2 : qb3Var.q()) {
                        pa3 t2 = pb3Var2.t();
                        pa3 pa3Var = pa3.ENABLED;
                        if (t2 == pa3Var) {
                            String r2 = pb3Var2.q().r();
                            x70 s = pb3Var2.q().s();
                            j85 b2 = k85.b(r2);
                            Set keySet = b2.a.b.keySet();
                            k91Var = k91Var2;
                            wa waVar = b2.a;
                            if (keySet.contains(cls)) {
                                try {
                                    if (!waVar.b.keySet().contains(cls) && !Void.class.equals(cls)) {
                                        throw new IllegalArgumentException("Given internalKeyMananger " + waVar.toString() + " does not support primitive class " + cls.getName());
                                    }
                                    try {
                                        switch (waVar.d) {
                                            case 0:
                                                t = pa.t(s, o32.a());
                                                break;
                                            default:
                                                t = db.t(s, o32.a());
                                                break;
                                        }
                                        if (!Void.class.equals(cls)) {
                                            waVar.b(t);
                                            ta taVar = (ta) waVar.b.get(cls);
                                            if (taVar != null) {
                                                Object a = taVar.a(t);
                                                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) osVar.B;
                                                if (pb3Var2.t() == pa3Var) {
                                                    int i3 = k41.a[pb3Var2.s().ordinal()];
                                                    if (i3 != b && i3 != 2) {
                                                        if (i3 != 3) {
                                                            if (i3 == 4) {
                                                                array = iq2.f;
                                                            } else {
                                                                f81.u("unknown output prefix type");
                                                                return k91Var;
                                                            }
                                                        } else {
                                                            array = ByteBuffer.allocate(5).put(b).putInt(pb3Var2.r()).array();
                                                        }
                                                    } else {
                                                        array = ByteBuffer.allocate(5).put((byte) 0).putInt(pb3Var2.r()).array();
                                                    }
                                                    pa3 t3 = pb3Var2.t();
                                                    pb3Var2.s();
                                                    wt4 wt4Var = new wt4(a, array, t3);
                                                    ArrayList arrayList = new ArrayList();
                                                    arrayList.add(wt4Var);
                                                    byte[] bArr3 = wt4Var.b;
                                                    if (bArr3 == null) {
                                                        bArr = k91Var;
                                                    } else {
                                                        bArr = Arrays.copyOf(bArr3, bArr3.length);
                                                    }
                                                    xt4 xt4Var = new xt4(bArr);
                                                    List list = (List) concurrentHashMap.put(xt4Var, Collections.unmodifiableList(arrayList));
                                                    if (list != null) {
                                                        ArrayList arrayList2 = new ArrayList();
                                                        arrayList2.addAll(list);
                                                        arrayList2.add(wt4Var);
                                                        concurrentHashMap.put(xt4Var, Collections.unmodifiableList(arrayList2));
                                                    }
                                                    if (pb3Var2.r() != qb3Var.r()) {
                                                        continue;
                                                    } else if (wt4Var.c == pa3Var) {
                                                        byte[] bArr4 = wt4Var.b;
                                                        if (bArr4 == null) {
                                                            bArr2 = k91Var;
                                                        } else {
                                                            bArr2 = Arrays.copyOf(bArr4, bArr4.length);
                                                        }
                                                        List list2 = (List) ((ConcurrentHashMap) osVar.B).get(new xt4(bArr2));
                                                        if (list2 == null) {
                                                            list2 = Collections.EMPTY_LIST;
                                                        }
                                                        if (!list2.isEmpty()) {
                                                            osVar.L = wt4Var;
                                                        } else {
                                                            i.i("the primary entry cannot be set to an entry which is not held by this primitive set");
                                                            return k91Var;
                                                        }
                                                    } else {
                                                        i.i("the primary entry has to be ENABLED");
                                                        return k91Var;
                                                    }
                                                } else {
                                                    f81.u("only ENABLED key is allowed");
                                                    return k91Var;
                                                }
                                            } else {
                                                throw new IllegalArgumentException("Requested primitive class " + cls.getCanonicalName() + " not supported.");
                                            }
                                        } else {
                                            throw new GeneralSecurityException("Cannot create a primitive for Void");
                                        }
                                    } catch (i53 e) {
                                        throw new GeneralSecurityException("Failures parsing proto of type ".concat(waVar.a.getName()), e);
                                    }
                                } catch (IllegalArgumentException e2) {
                                    throw new GeneralSecurityException("Primitive type not supported", e2);
                                }
                            } else {
                                StringBuilder sb = new StringBuilder("Primitive type ");
                                sb.append(cls.getName());
                                sb.append(" not supported by key manager of type ");
                                sb.append(waVar.getClass());
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
                            k91Var = k91Var2;
                        }
                        b = 1;
                        k91Var2 = k91Var;
                    }
                    k91 k91Var3 = k91Var2;
                    if (((mg6) k85.e.get(gg6.class)) != null) {
                        if (gg6.class.equals(cls2)) {
                            ?? obj = new Object();
                            if (((wt4) osVar.L) != null) {
                                obj.a = osVar;
                                return new k91(file, (Object) obj);
                            }
                            f81.u("Missing primary primitive.");
                            return k91Var3;
                        }
                        throw new GeneralSecurityException("Wrong input primitive class, expected " + gg6.class + ", got " + cls2);
                    }
                    throw new GeneralSecurityException("No wrapper found for ".concat(cls2.getName()));
                }
                f81.u("keyset must contain at least one ENABLED key");
                return null;
            }
            throw new GeneralSecurityException("No wrapper found for ".concat(gg6.class.getName()));
        }
        i.i("key URI must start with android-keystore://");
        return null;
    }
}
