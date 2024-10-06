import pandas as pd

def getDataframeSize(players: pd.DataFrame) -> List[int]:
    [rows ,coln] = players.shape
    return [rows ,coln]