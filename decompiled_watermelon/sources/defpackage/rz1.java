package defpackage;

import java.util.Collections;
import java.util.HashMap;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: rz1  reason: default package */
/* loaded from: classes.dex */
public final class rz1 {
    private static final /* synthetic */ rz1[] $VALUES;
    public static final rz1 AES256_GCM_HKDF_4KB;
    private final va3 mStreamingAeadKeyTemplate;

    static {
        gg4 gg4Var;
        rq2 rq2Var = rq2.SHA256;
        ib t = jb.t();
        t.c();
        jb.m((jb) t.B);
        t.c();
        jb.n((jb) t.B);
        t.c();
        jb.o((jb) t.B, rq2Var);
        fb q = gb.q();
        q.c();
        gb.n((gb) q.B);
        q.c();
        gb.m((gb) q.B, (jb) t.a());
        gb gbVar = (gb) q.a();
        ta[] taVarArr = {new ta(1)};
        HashMap hashMap = new HashMap();
        ta taVar = taVarArr[0];
        taVar.getClass();
        if (!hashMap.containsKey(gg6.class)) {
            hashMap.put(gg6.class, taVar);
            taVarArr[0].getClass();
            Collections.unmodifiableMap(hashMap);
            byte[] c = gbVar.c();
            ta3 ta3Var = ta3.RAW;
            sa3 s = ua3.s();
            s.c();
            ua3.m((ua3) s.B);
            v70 d = x70.d(c, 0, c.length);
            s.c();
            ua3.n((ua3) s.B, d);
            int i = ra3.b[ta3Var.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            gg4Var = gg4.CRUNCHY;
                        } else {
                            i.i("Unknown output prefix type");
                            return;
                        }
                    } else {
                        gg4Var = gg4.RAW;
                    }
                } else {
                    gg4Var = gg4.LEGACY;
                }
            } else {
                gg4Var = gg4.TINK;
            }
            s.c();
            ua3.o((ua3) s.B, gg4Var);
            rz1 rz1Var = new rz1("AES256_GCM_HKDF_4KB", 0, new va3((ua3) s.a()));
            AES256_GCM_HKDF_4KB = rz1Var;
            $VALUES = new rz1[]{rz1Var};
            return;
        }
        f81.i(gg6.class.getCanonicalName(), "KeyTypeManager constructed with duplicate factories for primitive ");
    }

    private rz1(String str, int i, va3 va3Var) {
        this.mStreamingAeadKeyTemplate = va3Var;
    }

    public static rz1 valueOf(String str) {
        return (rz1) Enum.valueOf(rz1.class, str);
    }

    public static rz1[] values() {
        return (rz1[]) $VALUES.clone();
    }

    public va3 getKeyTemplate() {
        return this.mStreamingAeadKeyTemplate;
    }
}
