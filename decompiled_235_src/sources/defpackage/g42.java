package defpackage;

import java.util.Collections;
import java.util.HashMap;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: g42  reason: default package */
/* loaded from: classes.dex */
public final class g42 {
    private static final /* synthetic */ g42[] $VALUES;
    public static final g42 AES256_GCM_HKDF_4KB;
    private final nh3 mStreamingAeadKeyTemplate;

    static {
        jp4 jp4Var;
        sw2 sw2Var = sw2.SHA256;
        ob t = pb.t();
        t.c();
        pb.m((pb) t.B);
        t.c();
        pb.n((pb) t.B);
        t.c();
        pb.o((pb) t.B, sw2Var);
        lb q = mb.q();
        q.c();
        mb.n((mb) q.B);
        q.c();
        mb.m((mb) q.B, (pb) t.a());
        mb mbVar = (mb) q.a();
        ya[] yaVarArr = {new ya(1)};
        HashMap hashMap = new HashMap();
        ya yaVar = yaVarArr[0];
        yaVar.getClass();
        if (!hashMap.containsKey(xr6.class)) {
            hashMap.put(xr6.class, yaVar);
            yaVarArr[0].getClass();
            Collections.unmodifiableMap(hashMap);
            byte[] c = mbVar.c();
            lh3 lh3Var = lh3.RAW;
            kh3 s = mh3.s();
            s.c();
            mh3.m((mh3) s.B);
            ca0 c2 = ea0.c(c, 0, c.length);
            s.c();
            mh3.n((mh3) s.B, c2);
            int i = jh3.b[lh3Var.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            jp4Var = jp4.CRUNCHY;
                        } else {
                            i.h("Unknown output prefix type");
                            return;
                        }
                    } else {
                        jp4Var = jp4.RAW;
                    }
                } else {
                    jp4Var = jp4.LEGACY;
                }
            } else {
                jp4Var = jp4.TINK;
            }
            s.c();
            mh3.o((mh3) s.B, jp4Var);
            g42 g42Var = new g42("AES256_GCM_HKDF_4KB", 0, new nh3((mh3) s.a()));
            AES256_GCM_HKDF_4KB = g42Var;
            $VALUES = new g42[]{g42Var};
            return;
        }
        e41.A(xr6.class.getCanonicalName(), "KeyTypeManager constructed with duplicate factories for primitive ");
    }

    private g42(String str, int i, nh3 nh3Var) {
        this.mStreamingAeadKeyTemplate = nh3Var;
    }

    public static g42 valueOf(String str) {
        return (g42) Enum.valueOf(g42.class, str);
    }

    public static g42[] values() {
        return (g42[]) $VALUES.clone();
    }

    public nh3 getKeyTemplate() {
        return this.mStreamingAeadKeyTemplate;
    }
}
