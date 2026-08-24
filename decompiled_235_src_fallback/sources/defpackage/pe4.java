package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pe4  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class pe4 implements defpackage.on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ defpackage.on2 B;
    public final /* synthetic */ android.content.Context L;

    public /* synthetic */ pe4(android.content.Context r2, defpackage.on2 r3) {
            r1 = this;
            r0 = 0
            r1.A = r0
            r1.<init>()
            r1.L = r2
            r1.B = r3
            return
    }

    public /* synthetic */ pe4(defpackage.on2 r2, android.content.Context r3) {
            r1 = this;
            r0 = 1
            r1.A = r0
            r1.<init>()
            r1.B = r2
            r1.L = r3
            return
    }

    @Override // defpackage.on2
    public final java.lang.Object c() {
            r4 = this;
            int r0 = r4.A
            jg7 r1 = defpackage.jg7.a
            android.content.Context r2 = r4.L
            on2 r4 = r4.B
            switch(r0) {
                case 0: goto L19;
                default: goto Lb;
            }
        Lb:
            r4.c()
            java.lang.String r4 = "Синхронизация с сервером RetroAchievements выполнена"
            r0 = 0
            android.widget.Toast r4 = android.widget.Toast.makeText(r2, r4, r0)
            r4.show()
            return r1
        L19:
            java.lang.String r0 = "NiFi Local Mesh активен. Запустите игру для поиска игроков!"
            r3 = 1
            android.widget.Toast r0 = android.widget.Toast.makeText(r2, r0, r3)
            r0.show()
            r4.c()
            return r1
    }
}
