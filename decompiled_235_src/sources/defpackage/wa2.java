package defpackage;

import android.app.NotificationChannel;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Year;
import java.time.ZoneId;
import java.time.ZoneOffset;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wa2  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class wa2 {
    public static /* bridge */ /* synthetic */ Class A() {
        return LocalTime.class;
    }

    public static /* bridge */ /* synthetic */ Class C() {
        return ZoneOffset.class;
    }

    public static /* bridge */ /* synthetic */ Class D() {
        return ZoneId.class;
    }

    public static /* synthetic */ NotificationChannel h(String str) {
        return new NotificationChannel("com.google.android.gms.availability", str, 4);
    }

    public static /* bridge */ /* synthetic */ Class l() {
        return LocalDate.class;
    }

    public static /* bridge */ /* synthetic */ Duration p(Object obj) {
        return (Duration) obj;
    }

    public static /* bridge */ /* synthetic */ Year t(Object obj) {
        return (Year) obj;
    }
}
