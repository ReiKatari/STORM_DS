package defpackage;

import java.sql.Timestamp;
import java.util.Date;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: oo6  reason: default package */
/* loaded from: classes.dex */
public final class oo6 extends md1 {
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oo6(int i, Class cls) {
        super(cls);
        this.c = i;
    }

    @Override // defpackage.md1
    public final Date a(Date date) {
        switch (this.c) {
            case 0:
                return new java.sql.Date(date.getTime());
            default:
                return new Timestamp(date.getTime());
        }
    }
}
