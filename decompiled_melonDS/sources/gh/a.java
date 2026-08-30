package gh;

import q.w;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a extends w {
    public Integer R;

    /* renamed from: b0  reason: collision with root package name */
    public Integer f5670b0;

    public final Integer getDisabledDrawable() {
        return this.f5670b0;
    }

    public final Integer getEnabledDrawable() {
        return this.R;
    }

    public final void setDisabledDrawable(Integer num) {
        this.f5670b0 = num;
    }

    public final void setEnabledDrawable(Integer num) {
        this.R = num;
    }

    public final void setToggleState(boolean z10) {
        Integer num;
        if (z10) {
            num = this.R;
        } else {
            num = this.f5670b0;
        }
        if (num != null) {
            setImageResource(num.intValue());
        }
    }
}
