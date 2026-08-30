package defpackage;

import java.sql.Timestamp;
import java.util.Date;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: yc6  reason: default package */
/* loaded from: classes.dex */
public final class yc6 extends q91 {
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yc6(int i, Class cls) {
        super(cls);
        this.c = i;
    }

    @Override // defpackage.q91
    public final Date a(Date date) {
        switch (this.c) {
            case 0:
                return new java.sql.Date(date.getTime());
            default:
                return new Timestamp(date.getTime());
        }
    }
}
