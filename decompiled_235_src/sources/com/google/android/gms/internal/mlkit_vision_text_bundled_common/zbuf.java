package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtz;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public abstract class zbuf<MessageType extends zbuf<MessageType, BuilderType>, BuilderType extends zbtz<MessageType, BuilderType>> extends zbsj<MessageType, BuilderType> {
    private static final Map zbb = new ConcurrentHashMap();
    private int zbd = -1;
    protected zbwm zbc = zbwm.zbc();

    public static Object zbA(zbvm zbvmVar, String str, Object[] objArr) {
        return new zbvw(zbvmVar, str, objArr);
    }

    public static void zbD(Class cls, zbuf zbufVar) {
        zbufVar.zbC();
        zbb.put(cls, zbufVar);
    }

    public static final boolean zbF(zbuf zbufVar, boolean z) {
        Object obj;
        byte byteValue = ((Byte) zbufVar.zbb(1, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zbk = zbvu.zba().zbb(zbufVar.getClass()).zbk(zbufVar);
        if (z) {
            if (true != zbk) {
                obj = null;
            } else {
                obj = zbufVar;
            }
            zbufVar.zbb(2, obj, null);
        }
        return zbk;
    }

    private final int zbc(zbvx zbvxVar) {
        return zbvu.zba().zbb(getClass()).zba(this);
    }

    private static zbuf zbe(zbuf zbufVar, byte[] bArr, int i, int i2, zbtp zbtpVar) {
        if (i2 == 0) {
            return zbufVar;
        }
        zbuf zbt = zbufVar.zbt();
        try {
            zbvx zbb2 = zbvu.zba().zbb(zbt.getClass());
            zbb2.zbh(zbt, bArr, 0, i2, new zbsq(zbtpVar));
            zbb2.zbf(zbt);
            return zbt;
        } catch (zbuq e) {
            throw e;
        } catch (zbwk e2) {
            throw e2.zba();
        } catch (IOException e3) {
            if (e3.getCause() instanceof zbuq) {
                throw ((zbuq) e3.getCause());
            }
            throw new zbuq(e3);
        } catch (IndexOutOfBoundsException unused) {
            fa6.j("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return null;
        }
    }

    public static zbud zbr(zbvm zbvmVar, Object obj, zbvm zbvmVar2, zbui zbuiVar, int i, zbww zbwwVar, Class cls) {
        return new zbud(zbvmVar, obj, zbvmVar2, new zbuc(null, 32149011, zbwwVar, false, false), cls);
    }

    public static zbuf zbs(Class cls) {
        Map map = zbb;
        zbuf zbufVar = (zbuf) map.get(cls);
        if (zbufVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zbufVar = (zbuf) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (zbufVar == null) {
            zbuf zbufVar2 = (zbuf) ((zbuf) zbws.zbe(cls)).zbb(6, null, null);
            if (zbufVar2 != null) {
                map.put(cls, zbufVar2);
                return zbufVar2;
            }
            e41.m();
            return null;
        }
        return zbufVar;
    }

    public static zbuf zbu(zbuf zbufVar, byte[] bArr, zbtp zbtpVar) {
        zbuf zbe = zbe(zbufVar, bArr, 0, bArr.length, zbtpVar);
        if (zbe != null && !zbF(zbe, true)) {
            throw new zbwk(zbe).zba();
        }
        return zbe;
    }

    public static zbuk zbv() {
        return zbtw.zbf();
    }

    public static zbul zbw() {
        return zbug.zbf();
    }

    public static zbum zbx() {
        return zbva.zbf();
    }

    public static zbun zby() {
        return zbvv.zbe();
    }

    public static Object zbz(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            u34.p("Couldn't use Java reflection to implement protocol message reflection.", e);
            return null;
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (!(cause instanceof Error)) {
                    u34.p("Unexpected exception thrown by generated accessor method.", cause);
                    return null;
                }
                throw ((Error) cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zbvu.zba().zbb(getClass()).zbj(this, (zbuf) obj);
    }

    public final int hashCode() {
        if (!zbG()) {
            int i = this.zba;
            if (i == 0) {
                int zbn = zbn();
                this.zba = zbn;
                return zbn;
            }
            return i;
        }
        return zbn();
    }

    public final String toString() {
        return zbvo.zba(this, super.toString());
    }

    public final void zbB() {
        zbvu.zba().zbb(getClass()).zbf(this);
        zbC();
    }

    public final void zbC() {
        this.zbd &= Integer.MAX_VALUE;
    }

    public final void zbE(int i) {
        this.zbd = (this.zbd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    public final boolean zbG() {
        if ((this.zbd & Integer.MIN_VALUE) != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvm
    public final /* synthetic */ zbvl zbJ() {
        return (zbtz) zbb(5, null, null);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvm
    public final /* synthetic */ zbvl zbK() {
        zbtz zbtzVar = (zbtz) zbb(5, null, null);
        zbtzVar.zbh(this);
        return zbtzVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvm
    public final void zbL(zbtk zbtkVar) {
        zbvu.zba().zbb(getClass()).zbi(this, zbtl.zba(zbtkVar));
    }

    public abstract Object zbb(int i, Object obj, Object obj2);

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsj
    public final int zbj(zbvx zbvxVar) {
        if (zbG()) {
            int zba = zbvxVar.zba(this);
            if (zba >= 0) {
                return zba;
            }
            i.m(lb1.g(zba, "serialized size must be non-negative, was "));
            return 0;
        }
        int i = this.zbd & Integer.MAX_VALUE;
        if (i == Integer.MAX_VALUE) {
            int zba2 = zbvxVar.zba(this);
            if (zba2 >= 0) {
                this.zbd = (this.zbd & Integer.MIN_VALUE) | zba2;
                return zba2;
            }
            i.m(lb1.g(zba2, "serialized size must be non-negative, was "));
            return 0;
        }
        return i;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvn
    public final /* synthetic */ zbvm zbm() {
        return (zbuf) zbb(6, null, null);
    }

    public final int zbn() {
        return zbvu.zba().zbb(getClass()).zbb(this);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvm
    public final int zbo() {
        if (zbG()) {
            int zbc = zbc(null);
            if (zbc >= 0) {
                return zbc;
            }
            i.m(lb1.g(zbc, "serialized size must be non-negative, was "));
            return 0;
        }
        int i = this.zbd & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int zbc2 = zbc(null);
        if (zbc2 >= 0) {
            this.zbd = (this.zbd & Integer.MIN_VALUE) | zbc2;
            return zbc2;
        }
        i.m(lb1.g(zbc2, "serialized size must be non-negative, was "));
        return 0;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvn
    public final boolean zbp() {
        return zbF(this, true);
    }

    public final zbtz zbq() {
        return (zbtz) zbb(5, null, null);
    }

    public final zbuf zbt() {
        return (zbuf) zbb(4, null, null);
    }
}
