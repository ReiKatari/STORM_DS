package defpackage;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: wa  reason: default package */
/* loaded from: classes.dex */
public final class wa {
    public final Class a;
    public final Map b;
    public final Class c;
    public final /* synthetic */ int d;

    public wa(Class cls, ta[] taVarArr, int i) {
        this.d = i;
        this.a = cls;
        HashMap hashMap = new HashMap();
        for (ta taVar : taVarArr) {
            taVar.getClass();
            if (!hashMap.containsKey(gg6.class)) {
                hashMap.put(gg6.class, taVar);
            } else {
                f81.i(gg6.class.getCanonicalName(), "KeyTypeManager constructed with duplicate factories for primitive ");
                throw null;
            }
        }
        if (taVarArr.length > 0) {
            taVarArr[0].getClass();
            this.c = gg6.class;
        } else {
            this.c = Void.class;
        }
        this.b = Collections.unmodifiableMap(hashMap);
    }

    public static void c(ya yaVar) {
        n67.a(yaVar.o());
        rq2 p = yaVar.p();
        rq2 rq2Var = rq2.UNKNOWN_HASH;
        if (p != rq2Var) {
            if (yaVar.q().n() != rq2Var) {
                as2 q = yaVar.q();
                if (q.o() >= 10) {
                    int i = va.a[q.n().ordinal()];
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                if (q.o() > 64) {
                                    f81.u("tag size too big");
                                    return;
                                }
                            } else {
                                f81.u("unknown hash type");
                                return;
                            }
                        } else if (q.o() > 32) {
                            f81.u("tag size too big");
                            return;
                        }
                    } else if (q.o() > 20) {
                        f81.u("tag size too big");
                        return;
                    }
                    if (yaVar.m() >= yaVar.q().o() + yaVar.o() + 9) {
                        return;
                    }
                    f81.u("ciphertext_segment_size must be at least (derived_key_size + tag_size + NONCE_PREFIX_IN_BYTES + 2)");
                    return;
                }
                f81.u("tag size too small");
                return;
            }
            f81.u("unknown HMAC hash type");
            return;
        }
        f81.u("unknown HKDF hash type");
    }

    public static void d(jb jbVar) {
        n67.a(jbVar.r());
        if (jbVar.s() != rq2.UNKNOWN_HASH) {
            if (jbVar.p() >= jbVar.r() + 25) {
                return;
            }
            f81.u("ciphertext_segment_size must be at least (derived_key_size + NONCE_PREFIX_IN_BYTES + TAG_SIZE_IN_BYTES + 2)");
            return;
        }
        f81.u("unknown HKDF hash type");
    }

    public final String a() {
        switch (this.d) {
            case 0:
                return "type.googleapis.com/google.crypto.tink.AesCtrHmacStreamingKey";
            default:
                return "type.googleapis.com/google.crypto.tink.AesGcmHkdfStreamingKey";
        }
    }

    public final void b(b1 b1Var) {
        switch (this.d) {
            case 0:
                pa paVar = (pa) b1Var;
                int r = paVar.r();
                int i = n67.a;
                if (r >= 0 && r <= 0) {
                    if (paVar.p().size() >= 16) {
                        if (paVar.p().size() >= paVar.q().o()) {
                            c(paVar.q());
                            return;
                        } else {
                            f81.u("key_value must have at least as many bits as derived keys");
                            return;
                        }
                    }
                    f81.u("key_value must have at least 16 bytes");
                    return;
                }
                throw new GeneralSecurityException(String.format("key has version %d; only keys with version in range [0..%d] are supported", Integer.valueOf(r), 0));
            default:
                db dbVar = (db) b1Var;
                int r2 = dbVar.r();
                int i2 = n67.a;
                if (r2 >= 0 && r2 <= 0) {
                    d(dbVar.q());
                    return;
                }
                throw new GeneralSecurityException(String.format("key has version %d; only keys with version in range [0..%d] are supported", Integer.valueOf(r2), 0));
        }
    }
}
