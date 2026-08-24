package com.google.android.gms.common.stats;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@java.lang.Deprecated
/* loaded from: classes.dex */
public abstract class StatsEvent extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public interface Types {
        public static final int EVENT_TYPE_ACQUIRE_WAKE_LOCK = 7;
        public static final int EVENT_TYPE_RELEASE_WAKE_LOCK = 8;
    }

    public StatsEvent() {
            r0 = this;
            r0.<init>()
            return
    }

    public final java.lang.String toString() {
            r4 = this;
            long r0 = r4.zzb()
            int r2 = r4.zza()
            java.lang.String r4 = r4.zzc()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            java.lang.String r0 = "\t"
            r3.append(r0)
            r3.append(r2)
            java.lang.String r0 = "\t-1"
            r3.append(r0)
            r3.append(r4)
            java.lang.String r4 = r3.toString()
            return r4
    }

    public abstract int zza();

    public abstract long zzb();

    public abstract java.lang.String zzc();
}
