import {ExploreTopBooks} from "./components/ExploreTopBooks";
import {Carousel} from "./components/Carousel";
import {Heroes} from "./components/Heroes";
import React from "react";
import {LibraryServices} from "./components/LibraryServices";

export const HomePage = () => {
    return (
        <>
            <ExploreTopBooks/>
            <Carousel/>
            <Heroes/>
            <LibraryServices/>
        </>
    )
}