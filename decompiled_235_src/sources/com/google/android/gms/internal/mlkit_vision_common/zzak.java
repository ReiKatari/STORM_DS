package com.google.android.gms.internal.mlkit_vision_common;

import androidx.recyclerview.widget.RecyclerView;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zzak implements rh4 {
    private static final Charset zza = Charset.forName("UTF-8");
    private static final na2 zzb;
    private static final na2 zzc;
    private static final qh4 zzd;
    private OutputStream zze;
    private final Map zzf;
    private final Map zzg;
    private final qh4 zzh;
    private final zzao zzi = new zzao(this);

    static {
        zzai j = xg6.j(1);
        HashMap hashMap = new HashMap();
        hashMap.put(j.annotationType(), j);
        zzb = new na2("key", xg6.u(hashMap));
        zzai j2 = xg6.j(2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(j2.annotationType(), j2);
        zzc = new na2("value", xg6.u(hashMap2));
        zzd = new qh4() { // from class: com.google.android.gms.internal.mlkit_vision_common.zzaj
            @Override // defpackage.y32
            public final void encode(Object obj, Object obj2) {
                zzak.zzg((Map.Entry) obj, (rh4) obj2);
            }
        };
    }

    public zzak(OutputStream outputStream, Map map, Map map2, qh4 qh4Var) {
        this.zze = outputStream;
        this.zzf = map;
        this.zzg = map2;
        this.zzh = qh4Var;
    }

    public static /* synthetic */ void zzg(Map.Entry entry, rh4 rh4Var) {
        rh4Var.add(zzb, entry.getKey());
        rh4Var.add(zzc, entry.getValue());
    }

    private static int zzh(na2 na2Var) {
        zzai zzaiVar = (zzai) na2Var.b(zzai.class);
        if (zzaiVar != null) {
            return zzaiVar.zza();
        }
        throw new RuntimeException("Field has no @Protobuf config");
    }

    private final long zzi(qh4 qh4Var, Object obj) {
        zzaf zzafVar = new zzaf();
        try {
            OutputStream outputStream = this.zze;
            this.zze = zzafVar;
            qh4Var.encode(obj, this);
            this.zze = outputStream;
            long zza2 = zzafVar.zza();
            zzafVar.close();
            return zza2;
        } catch (Throwable th) {
            try {
                zzafVar.close();
            } catch (Throwable th2) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                } catch (Exception unused) {
                }
            }
            throw th;
        }
    }

    private static zzai zzj(na2 na2Var) {
        zzai zzaiVar = (zzai) na2Var.b(zzai.class);
        if (zzaiVar != null) {
            return zzaiVar;
        }
        throw new RuntimeException("Field has no @Protobuf config");
    }

    private final zzak zzk(qh4 qh4Var, na2 na2Var, Object obj, boolean z) {
        long zzi = zzi(qh4Var, obj);
        if (z && zzi == 0) {
            return this;
        }
        zzn((zzh(na2Var) << 3) | 2);
        zzo(zzi);
        qh4Var.encode(obj, this);
        return this;
    }

    private final zzak zzl(lk7 lk7Var, na2 na2Var, Object obj, boolean z) {
        this.zzi.zza(na2Var, z);
        lk7Var.encode(obj, this.zzi);
        return this;
    }

    private static ByteBuffer zzm(int i) {
        return ByteBuffer.allocate(i).order(ByteOrder.LITTLE_ENDIAN);
    }

    private final void zzn(int i) {
        while (true) {
            int i2 = ((i & (-128)) > 0L ? 1 : ((i & (-128)) == 0L ? 0 : -1));
            OutputStream outputStream = this.zze;
            if (i2 != 0) {
                outputStream.write((i & 127) | 128);
                i >>>= 7;
            } else {
                outputStream.write(i & 127);
                return;
            }
        }
    }

    private final void zzo(long j) {
        while (true) {
            int i = (((-128) & j) > 0L ? 1 : (((-128) & j) == 0L ? 0 : -1));
            OutputStream outputStream = this.zze;
            if (i != 0) {
                outputStream.write((((int) j) & 127) | 128);
                j >>>= 7;
            } else {
                outputStream.write(((int) j) & 127);
                return;
            }
        }
    }

    public final rh4 add(String str, double d) {
        zza(na2.c(str), d, true);
        return this;
    }

    public final rh4 inline(Object obj) {
        zzf(obj);
        return this;
    }

    public final rh4 nested(String str) {
        return nested(na2.c(str));
    }

    public final rh4 zza(na2 na2Var, double d, boolean z) {
        if (z && d == 0.0d) {
            return this;
        }
        zzn((zzh(na2Var) << 3) | 1);
        this.zze.write(zzm(8).putDouble(d).array());
        return this;
    }

    public final rh4 zzb(na2 na2Var, float f, boolean z) {
        if (z && f == RecyclerView.B1) {
            return this;
        }
        zzn((zzh(na2Var) << 3) | 5);
        this.zze.write(zzm(4).putFloat(f).array());
        return this;
    }

    public final rh4 zzc(na2 na2Var, Object obj, boolean z) {
        if (obj != null) {
            if (obj instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) obj;
                if (!z || charSequence.length() != 0) {
                    zzn((zzh(na2Var) << 3) | 2);
                    byte[] bytes = charSequence.toString().getBytes(zza);
                    zzn(bytes.length);
                    this.zze.write(bytes);
                    return this;
                }
            } else if (obj instanceof Collection) {
                for (Object obj2 : (Collection) obj) {
                    zzc(na2Var, obj2, false);
                }
            } else if (obj instanceof Map) {
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    zzk(zzd, na2Var, entry, false);
                }
            } else if (obj instanceof Double) {
                zza(na2Var, ((Double) obj).doubleValue(), z);
                return this;
            } else if (obj instanceof Float) {
                zzb(na2Var, ((Float) obj).floatValue(), z);
                return this;
            } else if (obj instanceof Number) {
                zze(na2Var, ((Number) obj).longValue(), z);
                return this;
            } else if (obj instanceof Boolean) {
                zzd(na2Var, ((Boolean) obj).booleanValue() ? 1 : 0, z);
                return this;
            } else if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                if (!z || bArr.length != 0) {
                    zzn((zzh(na2Var) << 3) | 2);
                    zzn(bArr.length);
                    this.zze.write(bArr);
                    return this;
                }
            } else {
                qh4 qh4Var = (qh4) this.zzf.get(obj.getClass());
                if (qh4Var != null) {
                    zzk(qh4Var, na2Var, obj, z);
                    return this;
                }
                lk7 lk7Var = (lk7) this.zzg.get(obj.getClass());
                if (lk7Var != null) {
                    zzl(lk7Var, na2Var, obj, z);
                    return this;
                } else if (obj instanceof zzag) {
                    zzd(na2Var, ((zzag) obj).zza(), true);
                    return this;
                } else if (obj instanceof Enum) {
                    zzd(na2Var, ((Enum) obj).ordinal(), true);
                    return this;
                } else {
                    zzk(this.zzh, na2Var, obj, z);
                    return this;
                }
            }
        }
        return this;
    }

    public final zzak zzd(na2 na2Var, int i, boolean z) {
        if (!z || i != 0) {
            zzai zzj = zzj(na2Var);
            zzah zzahVar = zzah.DEFAULT;
            int ordinal = zzj.zzb().ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        zzn((zzj.zza() << 3) | 5);
                        this.zze.write(zzm(4).putInt(i).array());
                        return this;
                    }
                } else {
                    zzn(zzj.zza() << 3);
                    zzn((i + i) ^ (i >> 31));
                    return this;
                }
            } else {
                zzn(zzj.zza() << 3);
                zzn(i);
                return this;
            }
        }
        return this;
    }

    public final zzak zze(na2 na2Var, long j, boolean z) {
        if (!z || j != 0) {
            zzai zzj = zzj(na2Var);
            zzah zzahVar = zzah.DEFAULT;
            int ordinal = zzj.zzb().ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        zzn((zzj.zza() << 3) | 1);
                        this.zze.write(zzm(8).putLong(j).array());
                        return this;
                    }
                } else {
                    zzn(zzj.zza() << 3);
                    zzo((j >> 63) ^ (j + j));
                    return this;
                }
            } else {
                zzn(zzj.zza() << 3);
                zzo(j);
                return this;
            }
        }
        return this;
    }

    public final zzak zzf(Object obj) {
        if (obj == null) {
            return this;
        }
        qh4 qh4Var = (qh4) this.zzf.get(obj.getClass());
        if (qh4Var != null) {
            qh4Var.encode(obj, this);
            return this;
        }
        throw new RuntimeException("No encoder for ".concat(String.valueOf(obj.getClass())));
    }

    public final rh4 add(na2 na2Var, float f) {
        zzb(na2Var, f, true);
        return this;
    }

    public final rh4 nested(na2 na2Var) {
        throw new RuntimeException("nested() is not implemented for protobuf encoding.");
    }

    public final /* synthetic */ rh4 add(na2 na2Var, int i) {
        zzd(na2Var, i, true);
        return this;
    }

    @Override // defpackage.rh4
    public final /* synthetic */ rh4 add(na2 na2Var, long j) {
        zze(na2Var, j, true);
        return this;
    }

    @Override // defpackage.rh4
    public final rh4 add(na2 na2Var, Object obj) {
        zzc(na2Var, obj, true);
        return this;
    }

    public final /* synthetic */ rh4 add(na2 na2Var, boolean z) {
        zzd(na2Var, z ? 1 : 0, true);
        return this;
    }

    public final rh4 add(na2 na2Var, double d) {
        zza(na2Var, d, true);
        return this;
    }

    public final rh4 add(String str, int i) {
        zzd(na2.c(str), i, true);
        return this;
    }

    public final rh4 add(String str, long j) {
        zze(na2.c(str), j, true);
        return this;
    }

    public final rh4 add(String str, Object obj) {
        zzc(na2.c(str), obj, true);
        return this;
    }

    public final rh4 add(String str, boolean z) {
        zzd(na2.c(str), z ? 1 : 0, true);
        return this;
    }
}
