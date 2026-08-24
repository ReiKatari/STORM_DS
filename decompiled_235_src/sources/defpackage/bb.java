package defpackage;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bb  reason: default package */
/* loaded from: classes.dex */
public final class bb {
    public final Class a;
    public final Map b;
    public final Class c;
    public final /* synthetic */ int d;

    public bb(Class cls, ya[] yaVarArr, int i) {
        this.d = i;
        this.a = cls;
        HashMap hashMap = new HashMap();
        for (ya yaVar : yaVarArr) {
            yaVar.getClass();
            if (!hashMap.containsKey(xr6.class)) {
                hashMap.put(xr6.class, yaVar);
            } else {
                e41.A(xr6.class.getCanonicalName(), "KeyTypeManager constructed with duplicate factories for primitive ");
                throw null;
            }
        }
        if (yaVarArr.length > 0) {
            yaVarArr[0].getClass();
            this.c = xr6.class;
        } else {
            this.c = Void.class;
        }
        this.b = Collections.unmodifiableMap(hashMap);
    }

    public static void c(db dbVar) {
        kk7.a(dbVar.o());
        sw2 p = dbVar.p();
        sw2 sw2Var = sw2.UNKNOWN_HASH;
        if (p != sw2Var) {
            if (dbVar.q().n() != sw2Var) {
                by2 q = dbVar.q();
                if (q.o() >= 10) {
                    int i = ab.a[q.n().ordinal()];
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                if (q.o() > 64) {
                                    e41.v("tag size too big");
                                    return;
                                }
                            } else {
                                e41.v("unknown hash type");
                                return;
                            }
                        } else if (q.o() > 32) {
                            e41.v("tag size too big");
                            return;
                        }
                    } else if (q.o() > 20) {
                        e41.v("tag size too big");
                        return;
                    }
                    if (dbVar.m() >= dbVar.q().o() + dbVar.o() + 9) {
                        return;
                    }
                    e41.v("ciphertext_segment_size must be at least (derived_key_size + tag_size + NONCE_PREFIX_IN_BYTES + 2)");
                    return;
                }
                e41.v("tag size too small");
                return;
            }
            e41.v("unknown HMAC hash type");
            return;
        }
        e41.v("unknown HKDF hash type");
    }

    public static void d(pb pbVar) {
        kk7.a(pbVar.r());
        if (pbVar.s() != sw2.UNKNOWN_HASH) {
            if (pbVar.p() >= pbVar.r() + 25) {
                return;
            }
            e41.v("ciphertext_segment_size must be at least (derived_key_size + NONCE_PREFIX_IN_BYTES + TAG_SIZE_IN_BYTES + 2)");
            return;
        }
        e41.v("unknown HKDF hash type");
    }

    public final String a() {
        switch (this.d) {
            case 0:
                return "type.googleapis.com/google.crypto.tink.AesCtrHmacStreamingKey";
            default:
                return "type.googleapis.com/google.crypto.tink.AesGcmHkdfStreamingKey";
        }
    }

    public final void b(c1 c1Var) {
        switch (this.d) {
            case 0:
                ua uaVar = (ua) c1Var;
                int r = uaVar.r();
                int i = kk7.a;
                if (r >= 0 && r <= 0) {
                    if (uaVar.p().size() >= 16) {
                        if (uaVar.p().size() >= uaVar.q().o()) {
                            c(uaVar.q());
                            return;
                        } else {
                            e41.v("key_value must have at least as many bits as derived keys");
                            return;
                        }
                    }
                    e41.v("key_value must have at least 16 bytes");
                    return;
                }
                throw new GeneralSecurityException(String.format("key has version %d; only keys with version in range [0..%d] are supported", Integer.valueOf(r), 0));
            default:
                jb jbVar = (jb) c1Var;
                int r2 = jbVar.r();
                int i2 = kk7.a;
                if (r2 >= 0 && r2 <= 0) {
                    d(jbVar.q());
                    return;
                }
                throw new GeneralSecurityException(String.format("key has version %d; only keys with version in range [0..%d] are supported", Integer.valueOf(r2), 0));
        }
    }
}
